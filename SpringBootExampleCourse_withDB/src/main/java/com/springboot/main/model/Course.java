package com.springboot.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_id")
	private long id;

	@Column(name = "course_title")
	private String title;

	@Column(name = "course_desca")
	private String desca;

	@Column(name = "course_name")
	private String cName;

	//@OneToMany(cascade = CascadeType.ALL)
	//private Student student;

	public String getCname() {
		return cName;
	}

	public void setCname(String cName) {
		this.cName = cName;
	}


	/*
	 * public Student getStudent() { return student; }
	 * 
	 * public void setStudent(Student student) { this.student = student; }
	 */

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desca;
	}

	public void setDesc(String desca) {
		this.desca = desca;
	}

}
