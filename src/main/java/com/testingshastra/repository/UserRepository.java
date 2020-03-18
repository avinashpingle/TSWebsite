package com.testingshastra.repository;

import org.springframework.data.repository.CrudRepository;

import com.testingshastra.modal.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
