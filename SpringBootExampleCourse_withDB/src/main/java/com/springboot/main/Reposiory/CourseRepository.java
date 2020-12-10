package com.springboot.main.Reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.main.model.Course;
import com.springboot.main.model.Student;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
	public interface StudentRepository extends JpaRepository<Student, Long> {

}
}
