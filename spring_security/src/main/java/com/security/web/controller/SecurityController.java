package com.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
	@GetMapping("/")
	public String home() throws Exception {	
		return "loginPage";
	}
	
	@GetMapping("/main")
    public String loginPage() throws Exception {
        return "index";
    }
	
	@GetMapping("/access_denied_page")
	public String accessDeniedPage() {
		return "accessDeniedPage";
	}
	
}
