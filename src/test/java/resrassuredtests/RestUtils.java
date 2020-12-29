package resrassuredtests;
//import org.apache.commons.lang3.RamdomStringUtils;
import org.apache.commons.lang3.RandomStringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;
//POJO
public class RestUtils {
	
	@JsonProperty
	private String username;
	@JsonProperty
	private String job;



	public RestUtils(String username, String job) {
	    this.username = username;
	    this.job = job;
	}
	
	
	public static String getFirstName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John"+generatedString);
	}
	
	public static String getLastName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Soft engg"+generatedString);
	}
	
	public static String getUserName() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("John"+generatedString);
	}
	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("John"+generatedString);
	}
	
	public static String getEmail() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return (generatedString+"gmail.com");
	}
	
	public static String empName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John"+generatedString);
	}
	
	
	public static String empsal() {
		String generatedString = RandomStringUtils.randomNumeric(5);
		return (generatedString);
	}
	
	
	public static String empAge() {
		String generatedString = RandomStringUtils.randomNumeric(2);
		return (generatedString);
	}
	
	}
