package com.example.RestDemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.RestDemo.entities.Courses;


@Service
public interface CourseService {

	public List<Courses> getAllCourses();
	
	public Courses getCourse(String id);
	
	public Courses addCourse(Courses courses);
}
