package com.app.user.login.dto;

public class RegisterUserDTO {

	private Long id;
	private String name;
	private String lastName;
	private String emial;
	private String password;

	public RegisterUserDTO(Long id, String name, String lastName, String emial, String password) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.emial = emial;
		this.password = password;
	}

	public RegisterUserDTO(String name, String lastName, String emial, String password) {
		this.name = name;
		this.lastName = lastName;
		this.emial = emial;
		this.password = password;
	}

	public RegisterUserDTO(String emial) {
		this.emial = emial;
	}

	public RegisterUserDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
