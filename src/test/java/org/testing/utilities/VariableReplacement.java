package org.testing.utilities;

import java.util.regex.Pattern;

public class VariableReplacement {


public static String replaceVariable(String bodyData , String keyName, String value )
{
	bodyData=bodyData.replaceAll(Pattern.quote("{{"+keyName+"}}"), value);
	return bodyData;
}




}
