package resrassuredtests;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Demo10_DELETE_sadhanapratice {
	@Test
	public void test3() {

		JSONObject request = new JSONObject("rahul","Enng");
		given()
		.body(request.toString())
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();

	}

}


