package org.testing.TestSteps;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethod {

	Properties pro ; 
	public HttpMethod (Properties pro ){
	this.pro = pro;
		
	}
	
	    public  void post(String bodyData,  String uriKey){
		given().contentType(ContentType.JSON).body(bodyData).when().post(pro.getProperty(uriKey));
		//System.out.println(Res.asString());
	}
	
        public  void getAll(String uriKey){
		
		Response Res = given().contentType(ContentType.JSON).when().get(pro.getProperty(uriKey));
	    System.out.println(Res.asString());

}

        public Response postRequestReturnsResponse(String bodyData,  String uriKey)

        {
        	Response Res = given().contentType(ContentType.JSON).body(bodyData).when().post(pro.getProperty(uriKey));
    	    return Res;
        	
        }
      
        public  void getValueAsPerKey(String uriKey,String id){
    		String updateURI = pro.getProperty(uriKey) +"/"+id;
    		Response Res = given().contentType(ContentType.JSON).when().get(updateURI);
    	    System.out.println(Res.asString());

        }
}