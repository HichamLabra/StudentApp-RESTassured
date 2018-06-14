package com.student.test;

import static com.jayway.restassured.RestAssured.*;

import org.junit.Test;


import com.student.base.TestBase;


public class StudentDeleteTest extends TestBase {

	@Test
	public void deleteStudent() {
		given()
		.when()
		.delete("/104")
		.then()
		.statusCode(204);
	}
}
