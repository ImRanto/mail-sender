package com.example.test.endpoint.rest.controller;

import com.example.test.endpoint.event.EventProducer;
import com.example.test.endpoint.event.model.SendEmailRequested;
import com.example.test.service.HelloWorldService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloWorldController {
  private final HelloWorldService service;
  private final EventProducer<SendEmailRequested> eventProducer;

  @GetMapping("/hello")
  public String helloWorld(@RequestParam String name) {
    return service.uploadHelloWorldMessage(name);
  }

  @GetMapping("/hello")
  @SneakyThrows
  public String helloWorldMailer(@RequestParam String to) {
    var event = SendEmailRequested.builder().to(to).build();
    eventProducer.accept(List.of(event));
    return "... world!";
  }
}
