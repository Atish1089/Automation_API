package RestApiAutomation.restAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class fileReadData {
	
	
	public void readJsonDataFromFile() throws FileNotFoundException
	
	{
		File json = new File("../rest_Api_Automation/bodyData.json");
		FileReader fr = new FileReader(json);
		JSONTokener JT = new JSONTokener(fr);
		JSONObject newObj = new JSONObject(JT);
		System.out.println(newObj);
		given().
        contentType(ContentType.JSON)
        .body(newObj.toString()).when().post("http://localhost:3000/SchoolName");
		
	}
public static void main(String[] args) throws FileNotFoundException {
	fileReadData fd = new fileReadData();
	fd.readJsonDataFromFile();
}
}
