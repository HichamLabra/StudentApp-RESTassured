package com.student.base;

import org.junit.BeforeClass;

import com.jayway.restassured.RestAssured;

public class TestBase {
	
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
}
