package get;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.net.URI;
import java.net.URISyntaxException;

public class SimpleGet {
	@Test
	public void get() {
		String uri = "http://localhost:8085/laptop-bag/webapi/api/ping/Ruslan";
		when().get(uri);
		String hi=when().get(uri).toString();
		System.out.println(hi);
		int statusCode = when().get(uri).thenReturn().statusCode();
		System.out.println("Status code: "+statusCode);
		

	}
}
