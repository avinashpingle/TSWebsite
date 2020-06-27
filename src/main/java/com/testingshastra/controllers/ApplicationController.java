package com.testingshastra.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.testingshastra.dao.CourseRepo;
import com.testingshastra.dao.UserRepo;
import com.testingshastra.modal.Course;
import com.testingshastra.modal.User;
import com.testingshastra.services.UserService;

@Controller
public class ApplicationController {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CourseRepo courseRepo;

	@Autowired
	private PasswordEncoder passwordencoder;
	
	@RequestMapping("/")
	public String homePage(HttpServletRequest req) {
		return "index";
	}

	@RequestMapping("/register")
	public String registrationPage(User user) {
		return "register";
	}
	
	@RequestMapping("/signin")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("/create-user")
	public ModelAndView createUser(User user) {
		ModelAndView mview=new ModelAndView();
		user.setPassword(passwordencoder.encode(user.getPassword()));
		userRepo.save(user);
		mview.addObject("user",user);
		mview.setViewName("dashboard");
		return mview;
	}
	
	@GetMapping("/create-course")
	public ModelAndView createCourse(Course course) {
		ModelAndView mview=new ModelAndView();
		course.setCourseName("Python-Selenium");
		course.setCourseFees(11500.00f);
		course.setTrainerName("Avinash Pingale");
		course.setCourseDurationInMonths(4);
		courseRepo.save(course);
		mview.addObject("course",course);
		mview.setViewName("dashboard");
		return mview;
	}
	
	@PostMapping("/verifylogin")
	public ModelAndView verifyLogin(@RequestParam String phone_email, @RequestParam String password) {
		System.out.println("Hello");
		ModelAndView mv=new ModelAndView("dashboard");
		boolean isPhoneNumber;
		User user;
		if(phone_email.contains("@")) {
			isPhoneNumber=false;
		}else {
			isPhoneNumber=true;
		}
		
		if(isPhoneNumber) {
			user=userRepo.findByPhoneNumber(phone_email);
		}else {
			user=userRepo.findByEmail(phone_email);
		}
		 
		if(user.getPassword().equals(passwordencoder.encode(password))) {
			System.out.println("Login successful");
		}else {
			System.out.println("Invalid login credentials");
		}
		mv.setViewName("welcome");
		return mv;
	}

}
