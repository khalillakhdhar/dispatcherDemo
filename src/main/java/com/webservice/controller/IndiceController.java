package com.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.model.User;

@RestController
@RequestMapping("imc")
public class IndiceController {

	@GetMapping
	public String welcome()
	{
		return "imc est le rapport poid/taille²";
		
	}
	@PostMapping
	public String readImc( @RequestBody User user)
	{
		return user.toString();
		
	}
	
	
}
