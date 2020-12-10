package com.springboot.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.main.model.Course;
public interface CourseService {
	  public List<Course> getCourses();
	  public Course getCourseId(long courseId);
	  public Course addCourse(Course course);
	  public Course updateCourse(Course courseId); 
	  public void deleteCourse(long courseId);
	  //public Student createstudent()
}
