package RestAssuredTest;

import TestUtils.ExcelReader;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateRecords {
    private final ExcelReader ex = new ExcelReader();


    @Test
    public void updateRecord(int id,String EmpName,int age){
      //  RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest =  given();
        JSONObject param = new JSONObject();
        param.put("name",EmpName);
        //param.put("salary","500");
        param.put("age",age);

        httpRequest.body(param.toString());
        Response response =  httpRequest.put("/update/"+id);
        System.out.println(response.getStatusCode());

        response = httpRequest.get("/employee/"+id);
        System.out.println(response.getBody().asString());
        JsonPath json = response.jsonPath();
       // System.out.println(json.get("employee_name"));

    }

    @DataProvider(name = "TestData")
    public Object[][] getData(){
        String sheetName = "UpdateData";
        return ex.excelData(sheetName);
    }
}
