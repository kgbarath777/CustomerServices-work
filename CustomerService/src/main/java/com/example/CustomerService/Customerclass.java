package com.example.CustomerService;

import antlr.collections.List;

public class Customerclass {
 private Long id;
 private String email;
 private String firstname;
 private String lastname;
public Customerclass(Long id, String email, String firstname, String lastname) {
	super();
	this.id = id;
	this.email = email;
	this.firstname = firstname;
	this.lastname = lastname;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public List findAll() {
	// TODO Auto-generated method stub
	return null;
}
 

	
}
