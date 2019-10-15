package com.accenture.demo;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	

}
