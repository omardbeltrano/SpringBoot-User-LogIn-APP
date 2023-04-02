package com.app.user.login.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
	@Column(name = "last_name")
	private String lastName;
	private String email;
	private String password;
	
	/*anotación de mapeo de Hibernate para una relación @ManyToMany entre la entidad User y la entidad Roll, 
	  donde un usuario puede tener varios roles y un rol puede ser utilizado por varios usuarios.
	  Los atributos fetch y cascade especifican cómo se deben cargar los datos y qué acciones de cascada se 
	  deben aplicar a las entidades relacionadas cuando se realizan cambios en una entidad principal, en este caso USer.
	 */
	/*FetchType.EAGER, significa que la colección de roles asociada a cada usuario se carga automáticamente cuando se carga la entidad User principal.
	  CascadeType.ALL, significa que cualquier cambio realizado en la entidad principal(User) se propagará automáticamente a las entidades relacionadas(Roll).*/
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	/*@JoinTable se utiliza para especificar la tabla de unión que se utilizará para almacenar los datos de la relación @ManyToMany.
	@JoinTable se utiliza para especificar la tabla de unión que se utilizará para almacenar los datos de la relación @ManyToMany.*/
	@JoinTable(
			name = "user_roles",
			joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id")
			)
	private Collection<Rol> roles;

	public User(Long id, String name, String lastName, String email, String password,
			Collection<Rol> roles) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public User(String userName, String lastName, String email, String password, String name, Collection<Rol> roles) {
		this.name = name;
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

	public Collection<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}

}
