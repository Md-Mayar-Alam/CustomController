package com.controller;


import org.springframework.web.bind.annotation.GetMapping;

import com.custom.anno.MyController;

@MyController
public class PDPController {

	@GetMapping("/pdp")
	public String pdp() {
		return "pdp";
	}
}
