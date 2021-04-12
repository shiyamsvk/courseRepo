package com.cts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table
public class Courses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;	
	private String course_Name;	
	private String teacher_Name;
	private String class1;
	private String createdby;
	private String modifiedby;	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date created_date;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date modified_date;

	public Courses() {
		
	}

	public Courses(String course_Name, String teacher_Name, String class1, String createdby, String modifiedby,
			Date created_date, Date modified_date) {
		super();
		this.course_Name = course_Name;
		this.teacher_Name = teacher_Name;
		this.class1 = class1;
		this.createdby = createdby;
		this.modifiedby = modifiedby;
		this.created_date = created_date;
		this.modified_date = modified_date;
	}
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourse_Name() {
		return course_Name;
	}

	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}

	public String getTeacher_Name() {
		return teacher_Name;
	}

	public void setTeacher_Name(String teacher_Name) {
		this.teacher_Name = teacher_Name;
	}

	public String getClass1() {
		return class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}	
}
