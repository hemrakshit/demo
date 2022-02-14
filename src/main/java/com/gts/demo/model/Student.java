package com.gts.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Student {
	
	private Long id;
	private String name;
	private Integer age;
	private String email;

}
