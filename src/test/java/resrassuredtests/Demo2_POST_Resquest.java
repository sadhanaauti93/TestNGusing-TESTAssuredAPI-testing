package resrassuredtests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import org.testng.annotations.Test;
import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class Demo2_POST_Resquest {
	public static HashMap map=new HashMap(); 
	@BeforeClass
	public void postdata()
	{
		map.put("name", RestUtils.getFirstName());
		map.put("job", RestUtils.getLastName());
		/*
		 * map.put("UserName", RestUtils.getUserName()); map.put("Password",
		 * RestUtils.getPassword()); map.put("Email", RestUtils.getEmail());
		 */
		//RestAssured.baseURI =" https://reqres.in/api/users";
		//RestAssured.basePath ="/api/users";
	}
	RestUtils r = new RestUtils("rahul","actor");
	@Test
	public void testpost()
	{
		given()
			.contentType("application/json")
			.body(r)
			
		.when()
			.post("https://reqres.in/api/users")
			
		.then()
			.statusCode(201);
			//.and()
			//.body("Success", True));//equals("OPERTION_SUCCESS"));
			//.and()
			//.body("Message", equals("Operation completed successfully"));
	}
}
