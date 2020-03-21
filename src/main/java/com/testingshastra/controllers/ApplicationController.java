package com.testingshastra.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testingshastra.dao.UserRepo;
import com.testingshastra.modal.User;
import com.testingshastra.services.UserService;

@Controller
public class ApplicationController {

	@Autowired
	private UserRepo userRepo;

	@RequestMapping("/")
	public String homePage(HttpServletRequest req) {
		return "index";
	}

	@RequestMapping("/register")
	public String registration(User user) {
		return "register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	

}
