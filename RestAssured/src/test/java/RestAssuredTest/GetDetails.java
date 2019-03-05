package RestAssuredTest;


import TestUtils.ExcelReader;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetDetails {
    private final ExcelReader ex = new ExcelReader();


    @BeforeClass
    public void setup(ITestContext context){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        context.setAttribute("Name","Vainesh");
    }

    @Test
    public void getAllEmployees(ITestContext context){
       // RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
//        RequestSpecification httpRequest =  given();
//        Response response = httpRequest.get("/employees");
//        String responseBody = response.getBody().asString();
//        System.out.println(responseBody);
//        System.out.println(response.getHeaders().toString());
//        System.out.println(response.statusCode());
//        System.out.println(response.statusLine());
//
//        System.out.println("Vinesh");
//        JSONObject param = new JSONObject();
//        param.put("Viny","Nahar");
//        System.out.println(response.statusCode());
          given().
                  get("/employees").
                  then().
                  statusCode(200).
                  log().all();
          System.out.println(context.getAttribute("Name"));

    }


    @Test(dataProvider = "TestData")
    public void getEmployeeByID(String empID){
        int EmpId = Integer.parseInt(empID);
      //  RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get("/employee/"+EmpId);
        System.out.println(response.getBody().asString());
        JsonPath json = response.jsonPath();
       // System.out.println(json.get("id"));
    }




    @DataProvider(name = "TestData")
    public Object[][] getData(){
        String sheetName = "GetData";
        return ex.excelData(sheetName);
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
