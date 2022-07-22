package org.dataCreation.PojoClasses;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured. *;

import org.PojoObjects.PojoClass.BasicInfo;

public class DataCreationUsingPojoClassesSimpleJson {

	//Simple object data 
	//Format
	//{
    //}
	public void candidateInformation ()
	{
		BasicInfo basicInfo = new BasicInfo();	
		basicInfo.setAge("31");
		basicInfo.setEducation("Btech");
		basicInfo.setId("2");
		basicInfo.setJob("SE");
		basicInfo.setName("Sahil");
		basicInfo.setSchool("Adarsh Sen.Sec");

		
	Response res = given().contentType(ContentType.JSON).body(basicInfo).when().post("http://localhost:3000/CandidateInformation");	
	System.out.println(res.asString());
	}
	 public static void main(String[] args) 
	 {
		 DataCreationUsingPojoClassesSimpleJson dc = new DataCreationUsingPojoClassesSimpleJson();
		 dc.candidateInformation();
	}


	
}
