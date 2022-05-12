package com.projeto_tads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		
	}
	@GetMapping("/login")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

}
