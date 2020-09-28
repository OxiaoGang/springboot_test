package com.qa.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Acontroller {
	@RequestMapping("/a")
	public Object aaa(){
		return "aaaaa";
	}
}
