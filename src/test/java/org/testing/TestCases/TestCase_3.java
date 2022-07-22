package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.utilities.GenerateRandomNumber;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.VariableReplacement;

import io.restassured.response.Response;

public class TestCase_3 {

	
       static	String idToBeFetchedValue; 
public  void getValueAsPerID() throws IOException {
		
		Properties pro= PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");
		HttpMethod hp = new HttpMethod(pro);
		String bodyData= JsonFileRead.readJsonFile("../Automation_API/src/test/java/org/testing/recources/PostRequestPayload.json");
		String idValue = GenerateRandomNumber.randonNumber(4);
		bodyData=VariableReplacement.replaceVariable(bodyData, "id", idValue);
		Response res = hp.postRequestReturnsResponse(bodyData, "QA_URI");
		idToBeFetchedValue= JsonParsingUsingOrgJson.jsonParsing(res.asString(), "id"); 
		hp.getValueAsPerKey("QA_URI", idToBeFetchedValue);
	    
}	
	
}
