package com.microservices.usermanagement.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collation = "user")
public class UserDocument {

	@Id
	private String id;
	
	@Field
	private String firstName;
	
	@Field
	private String lastMame;
	
	@Field
	private String email;

	@Field
	private String username;

	@Field
	private Boolean emailVerified;

	
	public UserDocument() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastMame() {
		return lastMame;
	}
	public void setLastMame(String lastMame) {
		this.lastMame = lastMame;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
