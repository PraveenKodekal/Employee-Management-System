package com.ems.Entity;

import javax.persistence.*;

import lombok.Data;


@Entity
@Table
public class Employee {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name= "ename", nullable=false)
	private String name;
	@Column(name="email")
	private String email;
	
	public Employee() {
		
	}

	public Employee(long id, String name, String email) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setId(long id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
