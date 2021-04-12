package com.cts;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.model.Courses;
import com.cts.repository.CoursesRepostory;

@SpringBootApplication
public class CoursesProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoursesProjectApplication.class, args);
	}
	
	@Autowired
	private CoursesRepostory coursesRepostory;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		//SimpleDateFormat df1 = new SimpleDateFormat(" ");
		this.coursesRepostory.save(new Courses("english","Martha Fox","1","system"," ",new SimpleDateFormat("dd/MM/yyyy").parse("05/06/2021"),new SimpleDateFormat("dd/MM/yyyy").parse("05/06/2021")));
		this.coursesRepostory.save(new Courses("tamil","Justin Dickerson","2","system"," ",df.parse("05/06/2021"),df.parse("05/06/2021")));
	}
}