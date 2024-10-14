package com.api.crud.servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;

@Service
public class UserService {

	@Autowired
	IUserRepository userRepository;
	
	public ArrayList<UserModel> getUsers(){
		return (ArrayList<UserModel>) userRepository.findAll(); 
	}
	
	public UserModel saveUser(UserModel user) {
		return userRepository.save(user);
	}
	public Optional<UserModel> getById(Long id){
		return userRepository.findById(id);
	}
	
}
