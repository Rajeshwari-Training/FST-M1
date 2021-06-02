package com.ibm.rest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestAssuredGitTest {

	// Declare request specification
	RequestSpecification requestSpec;
	// Declare response specification
	ResponseSpecification responseSpec;

	String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCh0xcJQfS+nVjmrI4VEpfUH6wa3NsvTz1o1xpw75rh9BNwqiSOqcOKRNwyuD8qe9C4l88FuREbTmskVaCZDj5pXioj/vwf79YW3UGYTQhYmS6S48R38+yi88nBRhkcWgLyNbRDDA/06hIVeqbKqvcmn/Aiaxd2wohN+SnzVBPML2FePfcLVdWRJRkKYHNmSk8xsbQrnjWqBoajG/iOkB8ck4fyJ7nET4o/fUyfaKbZU2aUhlRl8qrdC19fqBQ1vsUW7Gq4YbRKBNuFAPOmUY5cnaCNOA5eawrJl204MkFmcpjQ9ajajtJvqtlHWzqdB5ySxMnpJugMY6QVfJhS+8Qr";
	int keyId = 0;	

	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "https://api.github.com";

		requestSpec = new RequestSpecBuilder()
				// Set content type
				.setContentType(ContentType.JSON)
				// Set access token
				.addHeader("Authorization", "token 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")
				// Set base URL
				.setBaseUri("https://api.github.com")
				// Build request specification
				.build();

	}

	@Test(priority=1)
	public void postRequest() {

		String reqBody = "{\"title\": \"TestKey\", \"key\": \""+sshKey+"\"}";

		Response response = given().spec(requestSpec) // Use requestSpec
				.body(reqBody) // Send request body
				.when().post("/user/keys"); // Send POST request

		// Response body
		String resBody = response.getBody().asPrettyString();		
		System.out.println("Response Body: ");
		System.out.print(resBody);

		// Check status code.
		response.then().statusCode(201);

	}

	@Test(priority=2)
	public void getRequest() {

		// Send get request.
		Response response = given().spec(requestSpec)
				.when().get("/user/keys"); 

		// Print response body
		String resBody = response.getBody().asPrettyString();
		System.out.println("Response Body : ");
		System.out.print(resBody);		

		// Check status code.
		response.then().statusCode(200);
	}

	@Test(priority=3)
	public void deleteRequest() {

		// Send delete request.
		Response response = given().spec(requestSpec)
				.pathParam("keyId", sshKey).when().delete("/user/keys/{keyId}");

		// Print response body
		String resBody = response.getBody().asPrettyString();
		System.out.println("Response Body : ");
		System.out.print(resBody);	

		// Check status code.
		response.then().statusCode(204);


	}


}
