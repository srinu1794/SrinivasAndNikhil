package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class RequestController{
	
	
	private String v1;
	
	private String v2;
	
	private String v3;
	
	private String v4;
	
	
	@RequestMapping("/")
	public String requestMethod(){
		
		
		
		return "Hello Capgemini";
		
		
		
	}

	
	

}
