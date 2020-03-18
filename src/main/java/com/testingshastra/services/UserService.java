package com.testingshastra.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.testingshastra.modal.User;
import com.testingshastra.repository.UserRepository;

@Service
@Transactional
public class UserService {
	private final UserRepository userRepo;
	public UserService(UserRepository userRepo) {
		this.userRepo=userRepo;
	
	}
	public void saveUser(User user) {
		userRepo.save(user);
	}

}
