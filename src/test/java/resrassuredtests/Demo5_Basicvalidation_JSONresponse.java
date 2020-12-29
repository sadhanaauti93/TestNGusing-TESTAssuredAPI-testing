package resrassuredtests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

/*
1) Test Status Code
2) Log Reponse
3) Verifying Single content in response body
4)  Verifying Multiple content in response body
5) Setting Parameters & Headers 
*/

public class Demo5_Basicvalidation_JSONresponse {
	
	//1) Test Status Code
	
	@Test
	public void testStatusCode()
	{
		given()
		
		.when()
			.get("http://jsonplaceholder.typicode.com/posts/5")
		.then()
			.statusCode(200);
			//.log().all();
		//given().when().get("http://jsonplaceholder.typicode.com/posts/5").then().statusCode(200);
		
	}
	
	//2) Log Reponse
	@Test(priority=2)
	public void testLogging()
	{
		given()
		
		.when()
			.get("https://reqres.in/api/users")
		
		.then()
			.statusCode(200);
			//.log().all();
	}
	
	//3) Verifying Single content in response body
	@Test(priority=3)
	public void testsinglecontent()
	{
		given()
		.when()
			.get("https://reqres.in/api/users")
		.then()
			.statusCode(200);
			//.body("RestResponse.result.name",equalTo("India"))
	}
	//4)  Verifying Multiple content in response body
	@Test(priority=4)      //Not run
	public void testmultiplecontent()
	{
		given()
		.when()
			.get("http://services.groupkt.com/country/get/all")
		.then()
			.body(hasItems("India","Germany"));
			//.statusCode(200);
	
}
	//5) Setting Parameters & Headers 
	@Test(priority=5)
	public void testparamersAndHeaders()
	{
		given()
			.param("george.bluth@reqres.in")
			.header("First_Name", null, null)
		
		.when()
			.get("https://reqres.in/api/users")
		.then()
			.statusCode(200)
			//.body("RestResponse.result.name",equalTo("India"))
			.log().all();
	}
	

}