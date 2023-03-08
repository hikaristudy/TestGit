package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")

public class Get {

	@GetMapping("/greeting")
	public String getgreeting(@RequestParam("param") String param) {
		return "受け取ったパラメータ=" + param;
	}
	
}
