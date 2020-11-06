package com.rest.tests;

import org.testng.annotations.Test;

import com.rest.payload.Payloads;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Demo {
	
	@Test
	
	public void test() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().queryParam("key", "qaclick123").headers("Content-Type","application/json")
		.body(Payloads.add()).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
		.extract().asString();
		
		JsonPath js = new JsonPath(response);
		System.out.println(js.getString("scope"));
	
		
	}

}
