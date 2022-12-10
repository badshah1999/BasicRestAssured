package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetRequest {
    @Test
    void getpetnames(){
        RestAssured.baseURI ="https://restful-booker.herokuapp.com/booking";
        RequestSpecification req = RestAssured.given();
        Response res = req.request(Method.GET,"831");
        System.out.println("Response:"+res.asPrettyString());
        System.out.println(res.getStatusLine());
    }
}
