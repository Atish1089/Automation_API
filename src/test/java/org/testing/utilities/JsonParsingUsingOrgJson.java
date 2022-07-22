package org.testing.utilities;

import org.json.JSONObject;

public class JsonParsingUsingOrgJson {

	
	
	public static String jsonParsing(String bodyData, String key)
	{
		JSONObject jo = new JSONObject(bodyData);
		return jo.getString(key);
				
	}	
}
