package com.demoapp1.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
 @GetMapping("/demoApp1")
  public String getMessage() {
	  return "Hello World from demoapp1";
  }
}
