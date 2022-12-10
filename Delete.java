package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.List;

public class Delete {
    @Test
    public void delete(){
        RestAssured.baseURI = "http://localhost:3000/posts";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response  =requestSpecification.request(Method.DELETE,"/4");
        System.out.println("Response:"+response);

    }
}
