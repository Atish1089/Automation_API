package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.PropertiesHandle;

public class TestCase_6 {
static String response; 
public void postDummyApi() throws IOException
	
	{
	Properties pro= PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");		
	HttpMethod hp = new HttpMethod(pro);
    String bodyData = JsonFileRead.readJsonFile("../Automation_API/src/test/java/org/testing/recources/dummyApiPostJson.json");
    response= hp.postRequestReturnsString(bodyData, "postnewAPIbOOKING");
    System.out.println(response);
   
}
}