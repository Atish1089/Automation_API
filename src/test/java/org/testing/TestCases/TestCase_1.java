package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.utilities.GenerateRandomNumber;
import org.testing.utilities.JsonFileRead;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.VariableReplacement;

public class TestCase_1 {


	
	public  void postMethod() throws IOException {
		
		Properties pro= PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");
		HttpMethod hp = new HttpMethod(pro);
		String bodyData= JsonFileRead.readJsonFile("../Automation_API/src/test/java/org/testing/recources/PostRequestPayload.json");
		String idValue = GenerateRandomNumber.randonNumber(4);
		bodyData=VariableReplacement.replaceVariable(bodyData, "id", idValue);
		hp.post(bodyData, "QA_URI");
	}
	
}
