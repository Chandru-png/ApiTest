package org.test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


@Test
public class PutAndPost {

	
//	public void test1() {
//		// TODO Auto-generated method stub
//		
//		
//		RequestSpecification request=RestAssured.given();
//		request.header("Content-Type", "application/json");
//		JSONObject json= new JSONObject();
//		json.put("id", "25");
//		json.put("title", "APITest_Webdriver");
//		json.put("author", "Chandru");
//		
//		request.body(json.toJSONString());
//	Response response=	request.post("http://localhost:3000/posts");
//		
//	int status=response.getStatusCode();
//	Assert.assertEquals(status, 201);
//	}
	
	@Test
	private void test2() {
		// TODO Auto-generated method stub
		
RequestSpecification  request	=	RestAssured.given();
Response res=request.delete("http://localhost:3000/posts/25");
int code=res.getStatusCode();

Assert.assertEquals(code, 404);

	}
	
	@Test
	public void test3() {
		// TODO Auto-generated method stub
		
		
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json= new JSONObject();
		json.put("id", "2");
		json.put("name", "chandru");
		json.put("job", "leader");
		
		request.body(json.toJSONString());
	Response response=	request.put("http://localhost:3000/posts/2");
		
	int status=response.getStatusCode();
	Assert.assertEquals(status, 200);
}}
