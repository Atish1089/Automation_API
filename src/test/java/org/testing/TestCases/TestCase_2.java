package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TestCase_2 {

	
	@Test(priority=2)
	public void getAll() throws IOException
	{
		System.out.println("----------------------------Test Case 2------------------------");
		Properties pro = PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");
		HttpMethod http = new HttpMethod(pro);
		http.getAll("QA_URI");
		
	}
	
	
	
	
	
	
	
	
	
	
}
