package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Navigate {

	@RequestMapping("/")
	public String Homepage() {
		return "index";
	}
}
