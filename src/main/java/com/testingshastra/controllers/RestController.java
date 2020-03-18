package com.testingshastra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testingshastra.modal.User;
import com.testingshastra.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private UserService userService;
	@ResponseBody
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/register")
	public String saveUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String phoneNumber,@RequestParam String email,@RequestParam String courseName,
			@RequestParam String password) {
		User user=new User(firstName,lastName,phoneNumber,email,courseName,password);
		userService.saveUser(user);
		return "User is created successfuly";
	}

}
