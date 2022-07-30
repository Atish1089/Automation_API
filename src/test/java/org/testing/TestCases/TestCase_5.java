package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TestCase_5 {

	@Test(priority=6)
	public void removerRecord() throws IOException
	{
		Properties pro = PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");
	     HttpMethod hp = new HttpMethod(pro);
		 hp.removeRecordAsPerId("QA_URI", TestCase_1.idToBeFetchedValue);
	     System.out.println("Removed Record after executing Test Case 5 is "+" "+ TestCase_1.idToBeFetchedValue);
		
	}
	
	
	
}
