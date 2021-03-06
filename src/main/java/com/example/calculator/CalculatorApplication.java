package com.example.calculator;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

  public static void main(String[] args) {
    var app = new SpringApplication(CalculatorApplication.class);
    app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
    app.run();
  }
}
