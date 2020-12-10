package com.springboot.main.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

 
import com.springboot.main.Reposiory.CourseRepository;
import com.springboot.main.model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getCourses() {
		List<Course> books = new ArrayList<Course>();
		courseRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

	public Course getCourseId(long courseId) {

		return courseRepository.findById(courseId).get();
	}

	public Course addCourse(Course course) {
		courseRepository.save(course);
		return course;
	}

	public Course updateCourse(Course course) {

		courseRepository.save(course);
		return course;
	}

	public void deleteCourse(long courseId) {

		courseRepository.deleteById(courseId);
		
	}
}
