package com.web.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	 @GetMapping(value = "/index")
	   public String index() {
	      return "index";
	   }
  
}