package com.student.test;

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
		courses.add("fsdlfjö");
		courses.add("sadfjlsdfjö");
		
		
		Student student = new Student();
		student.setFirstName("Hicham");
		student.setLastName("labra");
		student.setEmail("maxjojo@ab.de");
		student.setProgramme("Computer");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.patch("/103")
		.then()
		.statusCode(200);
	}
}
