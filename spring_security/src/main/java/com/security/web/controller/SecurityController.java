package com.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	
	@RequestMapping(value = "/")
	public String home() throws Exception {	
		return "loginPage";
	}
	
	@RequestMapping(value = "/main")
    public String loginPage() throws Exception {
        return "index";
    }
	
	@RequestMapping(value = "/access_denied_page")
	public String accessDeniedPage() {
		return "accessDeniedPage";
	}
	
}
