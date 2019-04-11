package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void testHelloPage() throws Exception {
    RequestBuilder request = MockMvcRequestBuilders.get("/hello");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("Hello from Spring!"));

  }


}
