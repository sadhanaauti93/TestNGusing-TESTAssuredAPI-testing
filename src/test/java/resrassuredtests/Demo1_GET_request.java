package resrassuredtests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import org.testng.annotations.Test;
/*
given() :-  set cookies,add auth, add param, set headers, info etc....
when() :- get,post,put,delete.....
than() :- validate status code,extract response,extract headers cookies & respnse body.........
*/
public class Demo1_GET_request {
	@Test
    public void getWeatherDeatils()
    {
        given()
        .when()
        	.get("https://reqres.in/api/users")
        .then()
       	.statusCode(200);
        //.statusLine("HTTP/1.1 200 ok")
        //.assertThat().body("Michael", additionalMatchers)
        //.header("Content-Type","application/json");
        }
}
