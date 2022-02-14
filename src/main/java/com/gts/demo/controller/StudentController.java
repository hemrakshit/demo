package com.gts.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gts.demo.model.StudentResponse;
import com.gts.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public @ResponseBody StudentResponse getAllStudents(){
		
		return studentService.getAllStudents();
				
	}

}
