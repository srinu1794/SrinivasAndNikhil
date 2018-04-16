package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class RequestController{
	
	
	private String v1;
	
	
	private String v2;
	
	@RequestMapping("/")
	public String requestMethod(){
		
		
		
		return "Hello Capgemini";
		
		
		
	}

	
	

}
