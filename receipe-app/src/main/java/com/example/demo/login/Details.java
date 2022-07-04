package com.example.demo.login;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;



@Entity
public @Data class Details {
	
	@Id
	private int id;
	private String username;
	private String password;
	
	

}
