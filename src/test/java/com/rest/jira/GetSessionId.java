package com.rest.jira;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.rest.payload.Jirapayloads;

public class GetSessionId {
	
	
	
	public String getSessionId() {
		
		RestAssured.baseURI = "http://localhost:8080/";
		String response = given().log().all().body(Jirapayloads.seesionID("saicharankantamani1", "8008220105@Sai"))
		.headers("Content-type", "application/json").when().post("rest/auth/1/session").then().log().all()
		.extract().asString();
		
		JsonPath js = new JsonPath(response);
		return js.getString("session.value");
	
	}
	
	@Test
	
	public void createIssue() {
		
		RestAssured.baseURI = "http://localhost:8080/";
		
		given().body(Jirapayloads.createIssue())
		.headers("JSESSIONID",getSessionId()).headers("Content-type","application/json").when().post("rest/api/2/issue")
		.then().log().body().assertThat().statusCode(201);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
