package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PutRequest {
    @Test
    public void putreq() {
        RestAssured.baseURI = "http://localhost:3000";
        RequestSpecification requestSpecification = RestAssured.given().header("Content-Type", "application/json").body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}");
        Response response = requestSpecification.request(Method.PUT, "/posts/2");
        System.out.println("Response:" + response.asPrettyString());
        System.out.println("Status:" + response.getStatusLine());
    }
}
