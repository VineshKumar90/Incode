package com.tweet.api;

import com.example.types.Entities;
import com.example.types.Schema;
import com.example.types.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;


import static io.restassured.RestAssured.given;

public class PostTweet {

   /* @Test(priority = 1,alwaysRun=true)
    public void fetchAPIPostViaPOJO()  {

   RestAssured.baseURI = "http://restapi.demoqa.com/customer/register";

   httpRequest = RestAssured.given();

   // JSONObject is a class that represents a Simple JSON.
   // We can add Key - Value pairs using the put method

   ExamplePost postdata=new ExamplePost().setFirstName("Virende" + new Random().nextInt(100))
                                 .setLastName("Sinh" + new Random().nextInt(100))
                                 .setUserName("simpleuer001" + new Random().nextInt(100))
                                 .setPassword("pasword1" + new Random().nextInt(100))
                                 .setEmail("somuser" + new Random().nextInt(100) + "@gmail.com"
                                 );


   Gson gson = new GsonBuilder().create();

   String json =gson.toJson(postdata);

   log.info("json-- representation --->"+json);

   httpRequest.header("Content-Type", "application/json");
   // Add the Json to the body of the request
   httpRequest.body(json);
   response = httpRequest.post();
   log.info(""+new Random().nextInt(100));
   // Retrieve the body of the Response
   body = response.getBody();
   // By using the ResponseBody.asString() method, we can convert the body
   // into the string representation.
   int statusCode = response.getStatusCode();
   Assert.assertEquals(statusCode, HttpStatus.SC_CREATED);
   log.info("Response status code :- \n" + statusCode);
   log.info("Response Body code :- \n" + response.getBody().asString());

    }*/


    @Test(enabled = true)
    public void postTweet() throws IOException {
//        String ConsumerAPIkeys = "CXA0A0jsZ9NtVaysgefDdjjoy";
////        String APISecretkey = "C4zLlbu4mmhyx5VXRjkviASoBBwBFXUCmAOPO7mMGIeRVQl31Q";
////        String AccessToken = "249135753-yIwVw8mpRgXNQTYmEkyPe4VJx0lKMAptaXMIOcgp";
////        String AccessTokenSecret = "fZvVX0R3CXvT2MfCxH5ulHW3qcJl4euCDu2Gx8hS65ac6";
////
////        RestAssured.baseURI = "https://api.twitter.com/1.1/statuses";
////        RequestSpecification httpRequest = given().queryParam("status", "My new Tweet").auth().oauth(ConsumerAPIkeys, APISecretkey, AccessToken, AccessTokenSecret);
////        Response response = httpRequest.post("/update.json");
////        System.out.println(response.getStatusCode());
////        System.out.println(response.getBody().asString());


        System.out.println("---------------------->"+System.getProperty("propertyValue"));
        System.out.println("---------------------->"+System.getProperty("browser"));

        System.out.println("---------------------->"+System.getProperty("browser"));}

    @Test
    public void getTweets() {
        String ConsumerAPIkeys = "CXA0A0jsZ9NtVaysgefDdjjoy";
        String APISecretkey = "C4zLlbu4mmhyx5VXRjkviASoBBwBFXUCmAOPO7mMGIeRVQl31Q";
        String AccessToken = "249135753-yIwVw8mpRgXNQTYmEkyPe4VJx0lKMAptaXMIOcgp";
        String AccessTokenSecret = "fZvVX0R3CXvT2MfCxH5ulHW3qcJl4euCDu2Gx8hS65ac6";

        RestAssured.baseURI = "https://api.twitter.com/1.1/statuses";

       // RequestSpecification httpRequest = RestAssured.given().;

        RequestSpecification httpRequest = given().auth().oauth(ConsumerAPIkeys, APISecretkey, AccessToken, AccessTokenSecret).queryParam("user_id", "249135753");
        Response response = httpRequest.get("/user_timeline.json");
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
        /*Schema sc = new Schema();
        sc.setCreatedAt("3412312");

        Gson gs = new GsonBuilder().create();
        String postdata = gs.toJson(sc);

        httpRequest.post(postdata);*/
        Schema[] list = response.as(Schema[].class,ObjectMapperType.GSON);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdStr());
            Entities ent = list[i].getEntities();
            List<Object> Uname = ent.getUserMentions();
            User user = list[i].getUser();
           System.out.println(user.getName());
            for(int j=0;j<Uname.size();j++) {
                System.out.println(Uname.get(j));
                System.out.println(Uname.get(j));
            }
        }
    }
}

