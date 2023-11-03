package com.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// components
// Beans
public class HomeController {
@GetMapping("")
public String sayHello()
{
return "hello am a resolved message from dispatcher";

}
@GetMapping("/api")
public String getFoos(@RequestParam(required = false,defaultValue = "123") String id) { 
	return "ID: " +id;
}
}
