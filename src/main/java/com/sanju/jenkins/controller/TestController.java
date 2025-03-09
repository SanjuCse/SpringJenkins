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

	@GetMapping("/greeting/{name}/{age}")
	private String test(@PathVariable String name, @PathVariable Integer age) {
		return "Hello " + name + " - Age " + age;
	}

	@GetMapping("/greeting/{name}/{address}")
	private String test(@PathVariable String name, @PathVariable String address) {
		return "Hello " + name + " - Address " + address;
	}
}
