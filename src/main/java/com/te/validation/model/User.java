package com.te.validation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	//User name should not be null or Empty
	//User name should have at least 2 charcaters
	@NotEmpty
	@Size(min = 2,message = "User name should have at least 2 charcatersS")
	@Column(name = "name",nullable = false)
	private String name;


	//Email should be a valid format
	//Email should not be null or empty
	@NotEmpty
	@Email
	private String email;


	//Password should not  be null or empty
	//Password should have at least 8 chars
	@NotEmpty
	@Size(min = 8,message = "Password should have at least 8 chars")
	private String password;

	public User() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(long id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

}
