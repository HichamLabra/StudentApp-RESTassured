package com.student.loggingexamples;

import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.student.base.TestBase;
import com.student.model.Student;

public class LoggingRequestValues extends TestBase {
	
	
	/**
	 * This test will print out all the request headers
	 */
	@Test
	public void test001() {
		System.out.println("---------------Printing Request Headres---------------");
		
		given()
		.log()
		.headers()
		.when()
		.get("/1")
		.then()
		.statusCode(200);
	}
	
	/**
	 * This test will print out all the request Parameters
	 */
	@Test
	public void test002() {
		System.out.println("---------------Printing Request Parameters---------------");
		
		given()
		.param("programme", "Computer Science")
		.param("limit", "1")
		.log()
		.params()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
	}
	
	/**
	 * This test will print out the request Body
	 */
	@Test
	public void test003() {
		System.out.println("---------------Printing Request Body---------------");
		
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
		.log()
		.body()
		.when()
		.body(student)
		.post()
		.then()
		.statusCode(201);
	}
	
	/**
	 * This test will print out all the Request Details
	 */
	@Test
	public void test004() {
		System.out.println("---------------Printing All the Details---------------");
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("C++");
		
		Student student = new Student();
		student.setFirstName("Hicham");
		student.setLastName("Labrahimi");
		student.setEmail("hicham.labrahimi@googlemail.com");
		student.setProgramme("Computer Scince");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.log()
		.all()
		.when()
		.body(student)
		.post()
		.then()
		.statusCode(201);
	}
	
	/**
	 * This test will print out all the Request Details if validation fails
	 */
	@Test
	public void test005() {
		System.out.println("---------------Printing All the Details if validation false---------------");
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("C++");
		
		Student student = new Student();
		student.setFirstName("Hicham");
		student.setLastName("Labrahimi");
		student.setEmail("hicham.labrahimi@googlemail.com");
		student.setProgramme("Computer Scince");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.log()
		.all()
		.when()
		.body(student)
		.post()
		.then()
		.statusCode(500);
	}

}
