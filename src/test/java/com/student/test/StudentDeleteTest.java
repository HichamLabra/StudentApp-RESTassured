package com.student.test;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.student.model.Student;

public class StudentDeleteTest {

	@BeforeClass
	public static void init() {

		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
	
	}
	
	@Test
	public void deleteStudent() {
		given()
		.when()
		.delete("/101")
		.then()
		.statusCode(204);
	}
}
