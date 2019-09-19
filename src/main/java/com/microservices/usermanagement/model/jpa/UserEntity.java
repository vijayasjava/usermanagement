package com.microservices.usermanagement.model.jpa;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 20, nullable = false)
	private String firstName;
	
	@Column(length = 20, nullable = false)
	private String lastMame;

	@Column(length = 20, nullable = false, unique = true)
	private String email;

	@Column(length = 20, nullable = false)
	private String username;

	@Column(length = 20, nullable = false)
	private String password;

	@Column(length = 20)
	private String encryptedPassword;

	@Column
	private Boolean emailVerified;
	
	public UserEntity() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public Boolean getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}
	
	
}
