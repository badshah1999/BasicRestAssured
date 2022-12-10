package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PostRequest {
    @Test
    public void Post(){
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification requestSpecification = RestAssured.given().header("Content-Type","application/json").body("{\n" +
                "    \"name\": \"Badshah\",\n" +
                "    \"job\": \"SDET\"\n" +
                "}");
        Response response = requestSpecification.request(Method.POST,"api/users?page=2");
        System.out.println("Response:"+response.asPrettyString());
        System.out.println("Status:"+response.getStatusLine());
    }
}
