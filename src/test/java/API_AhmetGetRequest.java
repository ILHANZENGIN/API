import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class API_AhmetGetRequest {

    @Test
            public void get01() {


        String url = "https://jsonplaceholder.typicode.com/posts/44";
/*
        JSONObject expBody = new JSONObject();


        expBody.put("userId",5);
        expBody.put("title","optio dolor molestias sit");
*/
        Response response = given().when().get(url);

        response.prettyPrint();
       /*

        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);

        JsonPath actBody = response.jsonPath();
        Assert.assertEquals(expBody.get("userId"),actBody.get("userId"));
        Assert.assertEquals(expBody.get("title"),actBody.get("title"));


        */
    }
}
