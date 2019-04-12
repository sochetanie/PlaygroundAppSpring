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

  @Test
  public void testShowPI() throws Exception {
    RequestBuilder request = MockMvcRequestBuilders.get("/math/pi");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("3.141592653589793"));
  }

  @Test
  public void testCalculateAdd() throws Exception {
    RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?operation=add&x=4&y=6");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("10"));
  }

  @Test
  public void testCalculateMultiply() throws Exception {
    RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?operation=multiply&x=4&y=6");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("24"));
  }

  @Test
  public void testCalculateSubtract() throws Exception {
    RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?operation=subtract&x=4&y=6");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("-2"));
  }

  @Test
  public void testCalculateDivide() throws Exception {
    RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?operation=divide&x=24&y=6");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("4"));
  }


  @Test
  public void testCalculateDefault() throws Exception {
    RequestBuilder request = MockMvcRequestBuilders.get("/math/calculate?x=30&y=5");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("35"));
  }

  @Test
  public void testMultipleNumSum() throws Exception {
    RequestBuilder request = MockMvcRequestBuilders.get("/math/sum?n=4&n=5&n=6");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("15"));
  }

  @Test
  public void testVolume() throws Exception {
    RequestBuilder request = MockMvcRequestBuilders.get("/math/volume/3/4/5");

    this.mvc.perform(request)
        .andExpect(status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("60"));
  }

}
