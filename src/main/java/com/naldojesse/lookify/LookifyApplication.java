package com.naldojesse.lookify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller

@SpringBootApplication
public class LookifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LookifyApplication.class, args);
	}


	@RequestMapping("/")
	public String index()  {
		return "index.jsp";
	}
}
