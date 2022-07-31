package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.testing.TestSteps.HttpMethod;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.VariableReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestCase_4 {

	
	static String phone ;
	@Test(priority=5)
	public void updateRecord() throws IOException
	{
		System.out.println("----------------------------Test Case 5------------------------");
		 Properties pro = PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");
	     HttpMethod hp = new HttpMethod(pro);
	     String bodyData= JsonFileRead.readJsonFile("../Automation_API/src/test/java/org/testing/recources/updatePayLoadPhoneNumber.json");		 
	     bodyData = VariableReplacement.replaceVariable(bodyData, "phone", RandomStringUtils.randomNumeric(10));
	     bodyData = VariableReplacement.replaceVariable(bodyData, "Name", "KontaReddy"+ RandomStringUtils.randomAlphabetic(10));
	     Response res= hp.updateValue(bodyData, "QA_URI", TestCase_1.idToBeFetchedValue);
		 phone = JsonParsingUsingOrgJson.jsonParsing(res.asString(), "phone");
		 System.out.println(phone);
	    
		
	}
	
}
