package com.example.demo.entitie;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String login;
	private String password;
	private String nom_user;
	private String type;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String login, String password, String nom_user, String type) {
		super();
		this.login = login;
		this.password = password;
		this.nom_user = nom_user;
		this.type = type;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
