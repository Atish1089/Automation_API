package RestApiAutomation.restAPI;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RestApiBodyDataSimpleJson {
    JSONObject jo = new JSONObject();
    public void postMethodWithoutThen() {


        jo.put("name", "Neelam Sharma");
        jo.put("age", "56");
        jo.put("id", "003");
        jo.put("height", "5.5");

        Response res = given()
            .contentType(ContentType.JSON)
            .body(jo.toString())
            .when()
            .post("http://localhost:3000/MemberData");

        System.out.println("Status Code is" + res.statusCode());

    }

    public void postMethodWithThen() {
        jo.put("name", "Partish Sharma");
        jo.put("age", "35");
        jo.put("id", "004");
        jo.put("height", "6");

        given()   //Static method of RequestSpecification class
            .contentType(ContentType.JSON)
            .body(jo.toString())
            .when()
            .post("http://localhost:3000/MemberData")
            .then()
            .statusCode(201);


    }

    public static void main(String[] args) {

        RestApiBodyDataSimpleJson rbd = new RestApiBodyDataSimpleJson();
        rbd.postMethodWithThen();
        rbd.postMethodWithoutThen();
    }

}