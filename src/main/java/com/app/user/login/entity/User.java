package com.app.user.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String userName;
	@Column(name = "last_name")
	private String lastName;
	private String email;
	private String password;
	private String name;
	private Collection<Rol> roles;

	public User(Long id, String userName, String lastName, String email, String password, String name,
			Collection<Rol> roles) {
		this.id = id;
		this.userName = userName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.name = name;
		this.roles = roles;
	}

	public User(String userName, String lastName, String email, String password, String name, Collection<Rol> roles) {
		this.userName = userName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.name = name;
		this.roles = roles;
	}

	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

}
