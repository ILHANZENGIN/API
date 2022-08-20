

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get02 {


    @Test
    public void get02(){

        //1. step: Set the URL
        String url= "https://restful-booker.herokuapp.com/booking/101";

        //2. step: Set the expected data

        //3. step: Sent get request and get the response
        Response response = given().when().get(url);
        response.prettyPrint();
/*
        //4. step: Do Assertion
         response.then().assertThat().statusCode(404).statusLine("HTTP/1.1 404 Not Found");
//
//         //How to assert if response body has a specific text
//        //assertTrue(x)
//        assertTrue(response.asString().contains("Not Found"));
//
//        //How to assert if response body does not have a specific text
//        //assertFalse(x) method passes when the x is false
//        assertFalse(response.asString().contains("TechProEd"));
//
//        //assertEquals(a, b) method passes if a equals b
//        assertEquals("Cowboy",response.getHeader("Server"));
*/

    }
}
