package com.student.test;

import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import static com.jayway.restassured.RestAssured.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.student.model.Student;

public class StudentPutTest {

	@BeforeClass
	public static void init() {

		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
	
	}
	
	
	@Test
	public void updateStudent() {
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("C++");
		courses.add("fsdlfjö");
		courses.add("sadfjlsdfjö");
		
		
		Student student = new Student();
		student.setFirstName("Hicham");
		student.setLastName("labra");
		student.setEmail("hichddla@ab.de");
		student.setProgramme("Computer");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.put("/103")
		.then()
		.statusCode(200);

	}
}
