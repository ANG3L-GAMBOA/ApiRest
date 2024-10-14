package com.api.crud.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.models.UserModel;
import com.api.crud.servicios.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ArrayList<UserModel> getUses(){
		return this.userService.getUsers();
	}
	
	@PostMapping
	public UserModel saveUser(@RequestBody UserModel user) {
		return this.userService.saveUser(user);
	}
	@GetMapping(path = "/{id}")
	public Optional<UserModel> getUserById(@PathVariable  Long id){
		return this.userService.getById(id);
	}
}	
