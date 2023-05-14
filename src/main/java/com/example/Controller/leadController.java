package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // to call the jsp
public class leadController {

	//127.0.0.1:8080/create
	
	@RequestMapping("/create") // like @webservlet
	public String viewCreateLeadForm() {
		return "create_lead"; //this acts as request dispatcher
		
	}
}
