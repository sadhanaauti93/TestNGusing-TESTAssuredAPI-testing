package resrassuredtests;

import static io.restassured.RestAssured.given;

//import org.xjson.simple.JSONObject;
import org.testng.annotations.Test;

public class Demo7_PUT_sadhanapratice {   

	@Test
	public void test2() {                

		JSONObject request = JSONObject("chaya","BBA"); 
		
		//request.put("name", "chaya");
		//request.put("job", "BAA");

		System.out.println(request);            //JSONObject
		System.out.println(request.toString());

		given()
		.body(request)
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200);

	}

	private JSONObject JSONObject(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}