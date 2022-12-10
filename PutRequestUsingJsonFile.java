package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class PutRequestUsingJsonFile {
    @Test
    public void readfile(){
        File jsonfile = new File("Jsonfile.json");
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .header("Content-Type","application/json")
                .body(jsonfile)
                .when()
                .put("api/users/2")
                .prettyPrint();
    }
}
