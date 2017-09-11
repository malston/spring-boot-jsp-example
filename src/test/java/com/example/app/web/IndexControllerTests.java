package com.example.app.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = IndexController.class)
public class IndexControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void index() throws Exception {
        this.mvc.perform(get("/")
                .param("message", "Hello"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(forwardedUrl("/WEB-INF/view/index.jsp"))
                .andExpect(model().attributeExists("message"))
                .andExpect(model().attribute("message", containsString("Hello")));
    }

    @Test
    public void next() throws Exception {
        this.mvc.perform(get("/next"))
                .andExpect(status().isOk())
                .andExpect(view().name("next"))
                .andExpect(forwardedUrl("/WEB-INF/view/next.jsp"))
                .andExpect(model().attributeExists("message"))
                .andExpect(model().attribute("message", equalTo("Hello! You are in new page !!")));
    }
}
