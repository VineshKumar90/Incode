package com.vinesh.googleApi;

import com.vinesh.common.EndPoint;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Test
public class GoogleBooks {
    RequestSpecification httpRequest = given();
    //Response res = httpRequest.get(EndPoint.GET_EMPLOYEE);
    Response response = httpRequest.get("/employees");
    int statusCode = response.getStatusCode();
        System.out.println(statusCode);
}
