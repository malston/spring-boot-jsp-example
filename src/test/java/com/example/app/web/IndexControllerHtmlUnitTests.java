package com.example.app.web;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading1;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.htmlunit.LocalHostWebClient;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerHtmlUnitTests {

    private WebClient webClient;

    @Autowired
    Environment environment;

    @Before
    public void setUp() {
        this.webClient = new LocalHostWebClient(this.environment);
    }

    @Test
    public void index() throws Exception {
        HtmlPage page = this.webClient.getPage("/");
        assertTrue(page.isHtmlPage());
        assertThat(((HtmlHeading1) page.getByXPath("//h1").get(0)).asText()).isEqualTo("Spring Boot JSP Example");
    }

    @Test
    public void next() throws Exception {
        HtmlPage page = this.webClient.getPage("/next");
        assertTrue(page.isHtmlPage());
        assertThat(((HtmlHeading1) page.getByXPath("//h1").get(0)).asText()).isEqualTo("Another page");
    }
}
