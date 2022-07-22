package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.utilities.PropertiesHandle;

public class TestCase_2 {

	
	
	public void getAll() throws IOException
	{
		Properties pro = PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");
		HttpMethod http = new HttpMethod(pro);
		http.getAll("QA_URI");
		
	}
	
	
	
	
	
	
	
	
	
	
}
