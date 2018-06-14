package com.student.loggingexamples;

import static org.hamcrest.Matchers.*;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import com.student.base.TestBase;

public class LoggingRequestValues extends TestBase {
	
	
	/**
	 * This test will print out all the request headers
	 */
	@Test
	public void test001() {
		
		given()
		.when()
		.get("/1")
		.then()
		.statusCode(200);
	}

}
