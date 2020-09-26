package com.example.demo.controller;

import com.example.demo.entitie.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserController  extends JpaRepository<User, String>{
	
	public User findByLogin(String login);
}
