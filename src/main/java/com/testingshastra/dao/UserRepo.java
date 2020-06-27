package com.testingshastra.dao;

import org.springframework.data.repository.CrudRepository;

import com.testingshastra.modal.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	public User findByPhoneNumber(String phoneNumber);
	public User findByEmail(String email);
	public User findByPassword(String password);
	public Iterable<User> findAll();

}
