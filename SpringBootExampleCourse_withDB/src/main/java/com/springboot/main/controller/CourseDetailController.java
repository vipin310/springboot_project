package com.springboot.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.model.Course;
import com.springboot.main.services.CourseService;

@RestController

@RequestMapping("/courses")

public class CourseDetailController {

	@Autowired
	private CourseService courseServics;

	@GetMapping("/course")
	public List<Course> getCourse() {
		return courseServics.getCourses();
	}

	@GetMapping("/getcoursesbyid/{courseId}")
	public Course getCourseId(@PathVariable String courseId) {
		return courseServics.getCourseId(Long.parseLong(courseId));
	}

	@PostMapping("/add")
	public Course addCourse(@RequestBody Course course) {
		return courseServics.addCourse(course);
	}

	@PostMapping("/update/{courseId}")
	public Course updateCourse(@RequestBody Course course) {
		 courseServics.updateCourse(course);
		return course;
	}

	@PostMapping("/delete/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		courseServics.deleteCourse(Long.parseLong(courseId));
	}
}
