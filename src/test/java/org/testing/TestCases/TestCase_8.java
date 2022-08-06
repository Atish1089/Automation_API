package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.utilities.PropertiesHandle;

public class TestCase_8 {

	
	public void getByID() throws IOException
	{
		Properties pro = PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");
		HttpMethod htp = new HttpMethod(pro);
		//htp.getValueAsPerKey("getDunmyAPI", TestCase_6.response);
		htp.getAll("getDunmyAPIById");
		
	}
	
}
