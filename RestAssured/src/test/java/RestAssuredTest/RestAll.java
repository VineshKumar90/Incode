package RestAssuredTest;


import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class RestAll {

    @BeforeClass
    public void setUpAll(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
    }

    @Test
    public void getDataTest(){
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Mumbai");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
    }

    @Test
    public void getHearder(){
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/Delhi");
        System.out.println(response.getHeader("Content-Type"));

        Headers headers = response.getHeaders();
        for(Header head: headers){
            System.out.print(head.getName()+ "-------->");
            System.out.println(head.getValue());
        }

        System.out.println(response.getBody().asString());
        System.out.println(response.body().asString());
    }
    
    @Test
    public void getSpecificData(){
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/employees");
        JsonPath jsonPath = response.jsonPath();
        List<String> empList = jsonPath.getList("employee_name");
        for(String emp : empList){
            System.out.println(emp);
        }
    }

    @Test
    public void postData(){
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject json = new JSONObject();
        json.put("FirstName", "Virender");
        httpRequest.body(json.toString());
        Response response = httpRequest.post("/register");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200,"Correct Status Code returned");
        System.out.println(response.getStatusCode());


    }

    
}
