package com.app.user.login.service;

import com.app.user.login.dto.RegisterUserDTO;
import com.app.user.login.entity.User;

public interface UserService {
	
	public User save(RegisterUserDTO registerDTO);
}
