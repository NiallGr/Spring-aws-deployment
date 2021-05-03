package com.springboot.awsdeployment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonControler {

	@RequestMapping("/getname")
	public String getName() {
		return("SpringBoot Deployment AWS v.2.1");
	}
}
