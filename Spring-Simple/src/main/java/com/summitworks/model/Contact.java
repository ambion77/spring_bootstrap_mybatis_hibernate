package com.summitworks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "CONTACTS")
public class Contact {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;

	@NotEmpty
	@Column(name = "FIRSTNAME")
	private String firstname;

	@NotEmpty
	@Column(name = "LASTNAME")
	private String lastname;

	@NotEmpty
	@Column(name = "EMAIL")
	private String email;

	@NotEmpty
	@Column(name = "PHONE")
	private String phone;

	@NotEmpty
	@Column(name = "USERNAME")
	private String username;

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}
