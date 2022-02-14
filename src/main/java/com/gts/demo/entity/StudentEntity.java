package com.gts.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class StudentEntity {
	
	@Id
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Integer age;
	
	@Column
	private String email;

}
