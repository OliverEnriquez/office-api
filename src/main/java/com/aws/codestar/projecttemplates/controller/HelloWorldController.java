package com.aws.codestar.projecttemplates.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

   @GetMapping(path = "/")
   public String helloWorld() {
      return "Hello world";
   }

}
