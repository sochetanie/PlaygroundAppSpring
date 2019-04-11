package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  MathService ms = new MathService();

  @GetMapping("/")
    public String welcomeTo() { return "WELCOME to Spring!!!!!!!!!!!"; }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello from Spring!";
    }

    @GetMapping("/math/pi")
    public String mathPI() {
      return ms.showPI();
    }

    @GetMapping("/math/calculate")
    public String mathService(@RequestParam (defaultValue = "add") String operation, @RequestParam int x, @RequestParam int y) {
      return ms.getCalculate(operation,x,y);
    }

}