package com.Springpro.Springpro.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveDetails(Student student) {
		return studentRepo.save(student);
	}

}
