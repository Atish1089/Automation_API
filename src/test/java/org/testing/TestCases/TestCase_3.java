package org.testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HttpMethod;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TestCase_3 {


    @Test(priority=3)
    public void getValueAsPerID() throws IOException {

        Properties pro = PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");
        HttpMethod hp = new HttpMethod(pro);
        hp.getValueAsPerKey("QA_URI", TestCase_1.idToBeFetchedValue);

    }
    @Test(priority=4)
    public void getAllValues() throws IOException {

        Properties pro = PropertiesHandle.loadProperties("../Automation_API/src/test/java/org/testing/recources/URI.properties");
        HttpMethod hp = new HttpMethod(pro);
        hp.getAll("QA_URI");
    }
}