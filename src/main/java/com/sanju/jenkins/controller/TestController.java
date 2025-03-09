package com.sanju.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/greeting/{name}")
	private String test(@PathVariable String name) {
		return "Hello " + name;
	}
}
