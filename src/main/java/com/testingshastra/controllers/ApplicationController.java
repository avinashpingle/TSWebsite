package com.testingshastra.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	public String registrationPage(User user) {
		return "register";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/create-user")
	public ModelAndView createUser(User user) {
		ModelAndView mview=new ModelAndView();
		userRepo.save(user);
		mview.addObject("user",user);
		mview.setViewName("dashboard");
		return mview;
	}
	
	@RequestMapping("/verifylogin")
	public ModelAndView verifyLogin(@RequestParam String phone_email, @RequestParam String password) {
		System.out.println("Hello");
		ModelAndView mv=new ModelAndView("dashboard");
		if(phone_email.equals(userRepo.findByPhoneNumber())||phone_email.equals(userRepo.findByEmail())) {
			if(password.equals(userRepo.findByPassword())) {
				System.out.println("Login successful");
			}else {
				System.out.println("Invalid credentials");
			}
		}else {
			System.out.println("Invalid credentials");
		}
		return mv;
	}

}
