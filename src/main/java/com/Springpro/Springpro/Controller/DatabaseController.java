package com.Springpro.Springpro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Services.StudentService;

@RestController
public class DatabaseController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/addStudent")
	public Student postDetails(@ModelAttribute Student student) {

		return studentService.saveDetails(student);
	}

}
