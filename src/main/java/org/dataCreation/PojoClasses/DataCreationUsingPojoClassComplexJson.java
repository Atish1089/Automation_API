package org.dataCreation.PojoClasses;

import static io.restassured.RestAssured.given;

import org.PojoObjects.PojoClass.AddressInfo;
import org.PojoObjects.PojoClass.BasicInfo;
import org.PojoObjects.PojoClass.Education;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DataCreationUsingPojoClassComplexJson {

	public void candidateInformation (){
    
	AddressInfo address = new AddressInfo();
		address.setHome("Pragpur");
		address.setWardNo("1");
		address.setAddress("V.P.O. Pragpur");
	
	Education ed = new Education();
	    ed.setClas("Tenth");
	    ed.setSchool("Adarsh");
	    ed.setStandard("Section1");
	
	    
	BasicInfo basicInfo = new BasicInfo();	
		basicInfo.setAge("32");
		basicInfo.setEducation("Btech");
		basicInfo.setId("2");
		basicInfo.setJob("SE");
		basicInfo.setName("Sarah");
		basicInfo.setSchool("Adarsh Sen.Sec");
		basicInfo.setAddress(address);
		basicInfo.setEdu(ed);
		
	Response res = given().contentType(ContentType.JSON).body(basicInfo).when().post(" http://localhost:3000/InfoAddress");	
	System.out.println(res.asString());
	}
	
	
	
	public static void main(String[] args) {
		DataCreationUsingPojoClassComplexJson jn = new DataCreationUsingPojoClassComplexJson();
		jn.candidateInformation();
	}
	
	
	
	
}
