package com.cts.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Exception.CoursesNotFoundException;
import com.cts.model.Courses;
import com.cts.service.CoursesService;

@RestController
@RequestMapping("api/")
public class CoursesController 
{

	@Autowired
	private CoursesService coursesService;
	
	@PostMapping("/addDetails")
	public void addDetails(@Valid @RequestBody Courses courses) {
		coursesService.addDetails(courses);
	}

	@GetMapping("courses")
	public List<Courses> showAllCourses() {

		List<Courses> courses=coursesService.getAllCourses();
		return courses;
    
	}
	
	@GetMapping("courses/{course_Name}")
	public Courses getAllCoursesById(@PathVariable("course_Name") String course_Name) {

		Courses courses=coursesService.getCoursesByCoursesName(course_Name);
		return courses;
	}

	@PutMapping("courses/edit")
	public String editCourses(@RequestBody @Valid Courses courses) throws CoursesNotFoundException
	{
		System.out.println("==============="+courses.getTeacher_Name());
		coursesService.editCourses(courses);
		return "Success";

	}
	
}
