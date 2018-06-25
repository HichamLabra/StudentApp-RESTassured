package com.student.test;

import org.junit.Test;

import com.jayway.restassured.response.Response;
import com.student.base.TestBase;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

public class StudentGetTest extends TestBase {

	/**
	 * This Method shows how to describe a request given() set cookies, add auth,
	 * adding parameters, setting header info .when() GET,POST,PUT,DELETE, etc.
	 * .then() Validate status code, extract response extract headers, extract
	 * cookies, extract header info
	 */
	@Test
	public void getAllStundenInformation() {

		Response response = given()
				.when()
				.get("/list");

		System.out.println(response.body().prettyPrint());

		// Validate the status code
		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);

	}

	/**
	 * This Method display student information by ID
	 */
	@Test
	public void getStudenInfo() {
		Response response = given()
				.when()
				.get("/1");

		System.out.println(response.body().prettyPrint());
		
		given()
		.when()
		.get("/1")
		.then()
		.statusCode(200);
	}
	
	/**
	 * 
	 */
	@Test
	public void getStudenFromFA() {
		
		//Don't work! The Response is empty
		Response response = given()
				.when()
				.get("/list?programme=Fincancial Analysis&limit=2");
		
		System.out.println(response.prettyPeek());
		
		//It's works fine! The Response show some results
		Response response2 = given()
				.param("programme", "Financial Analysis")
				.param("limit", 2)
				.when()
				.get("/list");
		
		System.out.println(response2.prettyPeek());
	}
}
