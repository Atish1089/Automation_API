package RestApiAutomation.restAPI;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestApiBodyDataWithArrayObject {

	
	public void jsonBodyDataArray()
	{
		/*
		 * {
		 *    [
		 *      {
		 *      },
		 *      
		 *      {
		 *      }  
		 * 
		 *    ]
		 * } 
		 */     
    	//Creation of innerObject1
    	JSONObject innerObject1 = new JSONObject();
        innerObject1.put("School", "Adarsh");
        innerObject1.put("Age", "30");
        innerObject1.put("HomeTown", "HP");
        //Creation of innerObject2
        JSONObject innerObject2 = new JSONObject();
        innerObject2.put("School", "Dashanun");
        innerObject2.put("Age", "31");
        innerObject2.put("HomeTown", "SL");

        //Positioning of ArrayObject
        JSONArray arrayObject = new JSONArray();
        arrayObject.put(0, innerObject1);
        arrayObject.put(1, innerObject2);
        //Creation of outerObject
        JSONObject outerObject = new JSONObject();
        outerObject.put("Type", "Studen");
        outerObject.put("ClassID", "A");
        outerObject.put("Info", arrayObject);
        
        System.out.println(outerObject);
        Response Res =given().contentType(ContentType.JSON).body(outerObject.toString()).when().post("http://localhost:3000/SchoolName");
        System.out.println(Res.asString());
	}
public void readJsonDataFromFile() throws FileNotFoundException
	
	{
		File json = new File("../restAPI/bodyData.json");
		FileReader fr = new FileReader(json);
		JSONTokener JT = new JSONTokener(fr);
		JSONObject newObj = new JSONObject(JT);
		System.out.println(newObj);
		given().
        contentType(ContentType.JSON)
        .body(newObj.toString()).when().post("http://localhost:3000/SchoolName");
		
	}
	
	
public static void main(String[] args) throws FileNotFoundException { 
	RestApiBodyDataWithArrayObject rp = new RestApiBodyDataWithArrayObject();
	rp.readJsonDataFromFile();
    }
}