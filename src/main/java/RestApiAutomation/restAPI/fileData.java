package RestApiAutomation.restAPI;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
@Test
public class fileData {
	public void readJsonDataFromFile() throws FileNotFoundException
	{
		File json = new File("../restAPI/bodyData.json");
		FileReader fr = new FileReader(json);
		JSONTokener JT = new JSONTokener(fr);
		JSONObject newObj = new JSONObject(JT);
		
		given().
        contentType(ContentType.JSON)
        .body(newObj.toString()).when().post(" http://localhost:3000/School Name");
		
	}
}
