package com.testingshastra.dao;

import org.springframework.data.repository.CrudRepository;

import com.testingshastra.modal.Course;

public interface CourseRepo extends CrudRepository<Course, Integer>{

}
