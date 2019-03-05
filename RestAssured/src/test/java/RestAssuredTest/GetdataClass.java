package RestAssuredTest;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;


public class GetdataClass {

    @Test
    public void getMethod(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get("/employees");
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        JsonPath path = response.jsonPath();
        System.out.println((path.getList("$")).size());
        System.out.println(path.getString("employee_name"));
       Headers headers = response.getHeaders();
       for(Header header: headers){
           System.out.println(header.getName() + "   " + header.getValue());
       }
    }



    @Test
    public void postMethod(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httprequest = given();
        JSONObject json = new JSONObject();
        json.put("name","vinay1");
        json.put("salary","1222");
        json.put("age","29");
        json.put("id","002");

        httprequest.body(json.toString());
        Response response = httprequest.post("/create");
        System.out.println(response.getStatusCode());
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200,"Correct Status Code returned");

    }

    @Test
    public void getDetail(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get("/employees");
        ResponseBody body = response.getBody();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200,"Correct Status Code returned");
        System.out.println(body.asString());
        JsonPath jsonPath = response.jsonPath();
        List<String> empList = jsonPath.getList("employee_name");
        Stream<String> s1 = empList.stream();
        s1.forEach(v-> System.out.println(v));
        //JsonPath path = response.jsonPath();


        /*RestAssured.baseURI = System.getProperty("baseurl");
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("admin");
        authScheme.setPassword("admin");
        RestAssured.authentication = authScheme;
        given().auth().preemptive().basic(username, password).when().get("{yourApiURL}").*/

    }

   /* @Test
    public void getGoogle(){
        RestAssured.baseURI = "https://maps.googleapis.com";
        RequestSpecification httpRequest = given().param("query","Churchgate Station").param("key","AIzaSyBrhdZP1wWpMXVEvzpY4-3W-FKieCYhVXg");

        Response response = httpRequest.get("/maps/api/place/textsearch/json");
       // System.out.println(response.getBody().asString());
        //Response response = httpRequest.get("/maps/api/place/textsearch/json?query=Churchgate&key=AIzaSyBrhdZP1wWpMXVEvzpY4-3W-FKieCYhVXg");
        //List<Map<String,String>> geo = response.jsonPath().getList("formatted_address");
        System.out.println(response.body().prettyPrint());
        Map<String, String> geo = response.jsonPath().getMap("results[0].geometry.location");
        System.out.println(geo.get("lng"));
        //System.out.println(response.getBody().asString());
    }


    @Test
    public void postTweet(){
        String  ConsumerAPIkeys = "Zc8EjAkNkWHyN42B2EeIlQ";
        String APISecretkey = "oBDg2o1EtbGCNeUClPnFNfQ4Nx2E691hbulfmohO3I";
        String AccessToken = "249135753-ZpzTo63oISDZgcaBwh2M0RnEn67sNEBEB1jfmeA";
        String AccessTokenSecret = "cAJIRhEyUnp9d0Izo22aYDuGWpT4dEF0EFoMSFUDFo";

        RestAssured.baseURI = "https://api.twitter.com/1.1/statuses";
        RequestSpecification httpRequest = given().queryParam("Status", "My new Tweet from Rest Assured").auth().oauth(ConsumerAPIkeys,APISecretkey,AccessToken,AccessTokenSecret);
        Response response = httpRequest.post("/update.json");
        System.out.println(response.getStatusCode());
    }*/
}
