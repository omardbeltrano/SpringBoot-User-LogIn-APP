package com.app.user.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.user.login.dto.RegisterUserDTO;
import com.app.user.login.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterUserController {

	private UserService userService;

	public RegisterUserController(UserService userService) {
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public RegisterUserDTO returnNewUserDTO() {
		return new RegisterUserDTO();
	}
	
	@GetMapping
	public String showFormRegister() {
		return "register";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") RegisterUserDTO registerDTO) {
		return "redirect:/register?success";
	}
}
