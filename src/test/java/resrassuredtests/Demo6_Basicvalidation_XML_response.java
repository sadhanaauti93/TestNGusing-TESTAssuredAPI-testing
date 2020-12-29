package resrassuredtests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import org.testng.annotations.Test;

/*
11) Verifying Single content in XML Response
2) Verifying Multiple contents in XMl response
3) verifying all the content in XML response in one go 
4) XPath with text() function
5) Find values using XML path in XML response
 
*/


 class Demo6_Basicvalidation_XML_response {
	 
	 //1) Verifying Single content in XML Response
	 @Test
	 void testsinglecontent() {
		 given()
		 
		 .when()
		 	.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		 
		 .then()
		 	//.body("CUSTOMER.ID", equals("15"))
		 	.log().all();
		}
	 //2) Verifying Multiple contents in XMLresponse
	 @Test(priority=2)
	 void testmultiplelecontent() {
		 given()
		 
		 .when()
		 	.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		 
		 .then()
		 	.body("CUSTOMER.ID", equals("15"))
		 	.body("CUSTOMER.FIRSTNAME", equals("Bill"))
		 	.body("CUSTOMER.LASTNAME", equals("clany"))
		 	.body("CUSTOMER.STREET", equals("319 upland pl."))
		 	.body("CUSTOMER.CITY", equals("Seattle"));
		 	//.log().all();
		}
        //3) verifying all the content in XML response in one go
	 
	 @Test(priority=3)
	 void testmultiplelecontentInOneGo() {
		 given()
		 
		 .when()
		 	.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		 
		 .then()
		 	.body("CUSTOMER.text()", equalTo("15BillClany319 upland pl.Seattle"));
		}
	 
	 //4) Find values using XML path in XML response
	 
	 @Test(priority=4)
	 void testusingXMLpath() {
		 given()
		 
		 .when()
		 	.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		 
		 .then()
		 	.body(hasxpath("/CUSTOMER/FIRSTNAME", ContainsString("Bill")));
		}
	 
	 // 5) XPath with text() function
	 @Test(priority=5)
	 void testusingXMLPath() {
		 given()
		 
		 .when()
		 	.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		 
		 .then()
		 	.body(hasxPath("/INVOICELIST/INVOICE[text()='30']")
		    .log().all();
		}
	
 }
