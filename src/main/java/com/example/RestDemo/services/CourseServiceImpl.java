package com.example.RestDemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.RestDemo.entities.Courses;


@Service
public class CourseServiceImpl implements CourseService {
	
	private List<Courses>myCourses=new ArrayList<>();
	
	 public CourseServiceImpl() {

		myCourses.add(new Courses(1,"java","shivam",100));
		myCourses.add(new Courses(2,"Python","Srt",200));
		myCourses.add(new Courses(3,"C#","Gopal",300));
		myCourses.add(new Courses(4,"c++","Yash",400));
		myCourses.add(new Courses(4,"c++","Yash",800));


	}


	@Override
	public List<Courses> getAllCourses() {
		// TODO Auto-generated method stub
		return myCourses;
	}


	@Override
	public Courses getCourse(String id) {
	
		return myCourses.get(Integer.parseInt(id)-1);
	}


	@Override
	public Courses addCourse(Courses courses) {
		// TODO Auto-generated method stub
		myCourses.add(courses);
		return courses;
	}

}
