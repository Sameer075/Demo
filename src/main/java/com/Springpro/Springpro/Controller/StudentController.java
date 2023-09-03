package com.Springpro.Springpro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

	@GetMapping("/")
	public String test() {
		System.out.println("Hello Sameer");
		return "home";
	}

//	@GetMapping("home")
//	public String index() {
//		System.out.println("Hello Sameer");
//		return "about";
//	}

}
