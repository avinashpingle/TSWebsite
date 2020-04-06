package com.testingshastra.dao;

import org.springframework.data.repository.CrudRepository;

import com.testingshastra.modal.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	public String findByPhoneNumber();
	public String findByEmail();
	public String findByPassword();

}
