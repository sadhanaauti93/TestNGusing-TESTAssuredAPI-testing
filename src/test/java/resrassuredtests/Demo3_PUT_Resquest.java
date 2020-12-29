package resrassuredtests;


import java.util.HashMap;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class Demo3_PUT_Resquest {
	
	public static HashMap map = new HashMap();
	String empName=RestUtils.empName();
	String empSalary=RestUtils.empsal();
	String empAge=RestUtils.empAge();
	int emp_id = 101;
	
	@BeforeClass
	public void putdata()
	{
		map.put("name", empName);
		map.put("salary", empSalary);
		map.put("age", empAge);
		
		RestAssured.baseURI= "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/update/+emp_id";
	}
	@Test
	public void testPUT()
	{
		given()
			.contentType("applicatin/json")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200);
			
			
	}
	
	

}