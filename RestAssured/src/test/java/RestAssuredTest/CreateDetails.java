package RestAssuredTest;

import TestUtils.ExcelReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class CreateDetails {
    private final ExcelReader ex = new ExcelReader();

    @Test(dataProvider = "TestData")
    public void createEmployeeRecord(Map<Object, Object> map){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest = given();

        JSONObject param = new JSONObject();
        param.put("name",map.get("Name"));
        param.put("salary",map.get("Salary"));
        param.put("age",map.get("Age"));

        httpRequest.body(param.toString());
        Response response = httpRequest.post("/create");
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Reporter.log("Created Record..");
        Assert.assertEquals(statusCode,200,"Correct Status Code returned");

    }

    @DataProvider(name = "TestData")
    public Object[][] getData(){
        Object data[][]=null;
        String sheetName = "PostData";
        data = ex.excelData(sheetName);
        return data;
    }


    @AfterMethod
    public void afterTest(ITestResult result){
        if(result.getStatus()==ITestResult.SUCCESS){
            System.out.println("Test Execution Successfully Completed");
        }
        else if(result.getStatus()== ITestResult.FAILURE){
            System.out.println("Test Case Execution Failed");
        }
        else if (result.getStatus() == ITestResult.SKIP){
            System.out.println("Test Case Execution Skipped");
        }
    }
}


