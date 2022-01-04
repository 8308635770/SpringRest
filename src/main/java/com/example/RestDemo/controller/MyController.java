package com.example.RestDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestDemo.entities.Courses;
import com.example.RestDemo.services.CourseService;

@Component
@RestController
@RequestMapping("/api")
public class MyController {
	
	private List<Courses>myCourses=new ArrayList<>();
	
	 public MyController() {
		
		myCourses.add(new Courses(1,"java","shivam",100));
		myCourses.add(new Courses(2,"Python","Srt",200));
		myCourses.add(new Courses(3,"C#","Gopal",300));
		myCourses.add(new Courses(4,"c++","Yash",400));

		 
	}
	 
	 @Autowired
	 private CourseService courseService;
	
	
	@GetMapping("/home")
	public String homePage() {
		return "HOME PAGE...";
	}
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return courseService.getAllCourses();
	}
	
	@GetMapping("/courses/{CourseId}")
	public Courses getCourse(@PathVariable String CourseId) {
		
		return courseService.getCourse(CourseId);
		
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses) {
		
		return courseService.addCourse(courses);
	}

}
