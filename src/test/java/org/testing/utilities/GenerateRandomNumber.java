package org.testing.utilities;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class GenerateRandomNumber {

	
	public static int randonNumber1()
	{
	    int randomNumber = RandomUtils.nextInt();
		return randomNumber;	
	}
	
	public static String randonNumber(int count)
	{
		String randomNumber = RandomStringUtils.randomNumeric(count);
		return randomNumber;
		
		//return randomNumber;	
	}
}
