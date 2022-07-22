package org.Test.Runner;

import java.io.IOException;

import org.testing.TestCases.TestCase_1;
import org.testing.TestCases.TestCase_2;
import org.testing.TestCases.TestCase_3;

public class Runner {

	
	
	public static void main(String[] args) throws IOException {
		
	    TestCase_1 testCase1 = new TestCase_1();
		TestCase_2 testCase2 = new TestCase_2();
		TestCase_3 testCase3 = new TestCase_3();
//	    testCase1.postMethod();
//		testCase2.getAll();
		testCase3.getValueAsPerID();
	}
	
	
}
