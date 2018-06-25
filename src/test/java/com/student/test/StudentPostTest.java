package com.student.test;

import static com.jayway.restassured.RestAssured.*;

import org.junit.Test;

import com.jayway.restassured.http.ContentType;
import com.student.base.TestBase;
import com.student.model.Student;

import java.util.ArrayList;



public class StudentPostTest extends TestBase {

	/**
	 * 
	 */
	@Test
	public void createNewStudent() {
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("C++");
		
		Student student = new Student();
		student.setFirstName("Hicham");
		student.setLastName("Labrahimi");
		student.setEmail("hicham.labrahimi@googlemail.de");
		student.setProgramme("Computer Scince");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.post()
		.then()
		.statusCode(201);

	}
}
