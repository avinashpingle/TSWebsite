package com.testingshastra.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testingshastra.modal.User;
import com.testingshastra.services.UserService;

@Controller
public class ApplicationController {

	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String homePage() {
		return "index";
	}

	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "dashboard";
	}

	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "dashboard";
	}

	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute User user, BindResult bindResult, HttpServletRequest request) {
		System.out.println("Saving the user");
		userService.saveUser(user);
		return "dashboard";
	}

}
