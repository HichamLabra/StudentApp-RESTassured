package com.student.test;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;

import org.junit.Test;

import com.jayway.restassured.http.ContentType;
import com.student.base.TestBase;
import com.student.model.Student;

public class StudentPatchTest extends TestBase{

	@Test
	public void patchStudent() {
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("C++");
		courses.add("RESTassured");
		courses.add("SerenityBDD");
		courses.add("Maven");
		
		
		Student student = new Student();
		student.setFirstName("Hicham");
		student.setLastName("Labrahimi");
		student.setEmail("hicham.labrahimi@devoteam.com");
		student.setProgramme("Computer Scince");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.patch("/104")
		.then()
		.statusCode(200);
	}
}
