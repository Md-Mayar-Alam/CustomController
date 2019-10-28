package com.controller;


import org.springframework.web.bind.annotation.GetMapping;

import com.custom.anno.MyController;

@MyController
public class HomepageController {

	@GetMapping("/homepage")
	public String homepage() {
		return "homepage";
	}
}
