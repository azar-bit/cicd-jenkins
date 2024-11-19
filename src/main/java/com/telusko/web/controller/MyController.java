package com.telusko.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("")
	public String show() {
		return ":: CICD jenkins pipeline working fine :: ";
	}
}
