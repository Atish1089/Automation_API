package RestApiAutomation.restAPI;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class RestApiBodyDataComplexJson {

    JSONObject jo_outer = new JSONObject();
    JSONObject jo_inner = new JSONObject();

    public void postMethodWithoutThenOuterObject() {
        jo_outer.put("Name", "Atish");
        jo_outer.put("Position", "SSE-1");
        jo_outer.put("Seat Number", "L2-B-167");
        jo_outer.put("Manager Name", "Himanshu Sharma");
        jo_outer.put("id", "004");
        jo_outer.put("Profile", jo_inner);

        jo_inner.put("Field", "Engg.");
        jo_inner.put("skills", "API-Testing");
        jo_inner.put("exp.", "3 Years");

        Response res = given()
            .contentType(ContentType.JSON)
            .body(jo_outer.toString())
            .when()
            .post("http://localhost:3000/SchoolName");
            System.out.println(res.statusCode());
    }

    public void postMethodWithThenOuterObject() {
        jo_outer.put("Name", "Namrita");
        jo_outer.put("Position", "SSE-1");
        jo_outer.put("Seat Number", "L2-B-168");
        jo_outer.put("Manager Name", "Himanshu Sharma");
        jo_outer.put("id", "004");
        jo_outer.put("Profile", jo_inner);

        jo_inner.put("Field", "Engg.");
        jo_inner.put("skills", "API-Testing");
        jo_inner.put("exp.", "2 Years");

        given()
            .contentType(ContentType.JSON)
            .body(jo_outer.toString())
            .when()
            .post("http://localhost:3000/SchoolName")
            .then()
            .statusCode(201);


    }


    public static void main(String[] args) {
        RestApiBodyDataComplexJson rbd = new RestApiBodyDataComplexJson();
       // rbd.postMethodWithoutThenOuterObject(); //Just change the ID and Name before Executing the code
        rbd.postMethodWithThenOuterObject();
    }

}