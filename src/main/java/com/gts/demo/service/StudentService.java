package com.gts.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gts.demo.entity.StudentEntity;
import com.gts.demo.model.Student;
import com.gts.demo.model.StudentResponse;
import com.gts.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public StudentResponse getAllStudents(){
		
		List<StudentEntity> studentEntityList = studentRepository.findAll();
		
		List<Student> studentList = new ArrayList<>();
		StudentResponse studentResponse = new StudentResponse();
		
		if(studentEntityList != null) {
			studentList = studentEntityList.stream()
			                               .map(this::mapStudentFromStudentEntity)
			                               .collect(Collectors.toList());
		}
		
		studentResponse.setStudents(studentList);
		
		return studentResponse;
		
	}
	
	private Student mapStudentFromStudentEntity(StudentEntity studentEntity) {
		Student student = new Student();
		
		student.setId(studentEntity.getId());
		student.setName(studentEntity.getName());
		student.setAge(studentEntity.getAge());
		student.setEmail(studentEntity.getEmail());
		
		return student;
	}

}
