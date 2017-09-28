package get;

import static io.restassured.RestAssured.*;

public class G {
	static String uri = "http://localhost:8085/laptop-bag/webapi/api/ping/Ruslan";
	public static void main(String[] args) {
		
		when().get(uri);
		String hi=when().get(uri).toString();
		System.out.println(hi);
		int statusCode = when().get(uri).thenReturn().statusCode();
		System.out.println("Status code: "+statusCode);

	}

}
