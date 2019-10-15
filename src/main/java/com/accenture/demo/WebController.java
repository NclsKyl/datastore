package com.accenture.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@Autowired
	PersonRepository personRepo;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	
	@GetMapping("/add")
	public String add(@RequestParam("name") String name) {
		
		Person p1 = new Person(name);
		personRepo.save(p1);
		return "home";
	}

}
