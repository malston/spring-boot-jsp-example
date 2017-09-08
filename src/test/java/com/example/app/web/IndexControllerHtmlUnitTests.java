package com.example.app.web;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = IndexController.class, secure = false)
public class IndexControllerHtmlUnitTests {

    @Autowired
    private WebClient webClient;

    @Test
    @Ignore
    public void index() throws Exception {
        HtmlPage page = this.webClient.getPage("/");
        assertThat(page.getBody().getTextContent()).isEqualTo("Spring Boot JSP Example");
    }

}
