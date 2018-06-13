package com.students.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;

public class StudentGetTest {

	/**
	 * This method initialized the base URI from StudenApplication and specify port
	 * number + bass path
	 */
	@BeforeClass
	public static void init() {

		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/student";
	}

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

		//System.out.println(response.body().prettyPrint());

		// Validate the status code
		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);

	}

	/**
	 * 
	 */
	@Test
	public void getStudenInfo() {
		Response response = given()
				.when()
				.get("/1");

		//System.out.println(response.body().prettyPrint());
		
		given()
		.when()
		.get("/1")
		.then()
		.statusCode(200);
	}
}
