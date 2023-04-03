package com.app.user.login.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.app.user.login.dto.RegisterUserDTO;
import com.app.user.login.entity.Rol;
import com.app.user.login.entity.User;
import com.app.user.login.repository.UserRepository;

@Service
public class UserServiceImplement implements UserService{

	private UserRepository userRepository;
	
	public UserServiceImplement(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User save(RegisterUserDTO registerDTO) {
		
		User user = new User(registerDTO.getName(), registerDTO.getLastName(), registerDTO.getEmial(), 
							 registerDTO.getPassword(), Arrays.asList(new Rol("ROLE_USER")));
		
		return userRepository.save(user);
	}
}
