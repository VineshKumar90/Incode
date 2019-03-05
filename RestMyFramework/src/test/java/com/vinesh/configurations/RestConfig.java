package com.vinesh.configurations;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class RestConfig {


    @BeforeMethod
    public void configurations(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RestAssured.basePath = "";
    }
}
