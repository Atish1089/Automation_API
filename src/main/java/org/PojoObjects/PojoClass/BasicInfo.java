package org.PojoObjects.PojoClass;

public class BasicInfo {

	private String Name;
	private String Age;
	private String Id;
	private String School;
	private String Education;
	private String Job;
	private AddressInfo Address;
	private Education edu;
	

	public AddressInfo getAddress() {
		return Address;
	}
	public void setAddress(AddressInfo address) {
		Address = address;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School = school;
	}
	public Education getEdu() {
		return edu;
	}
	public void setEdu(Education edu) {
		this.edu = edu;
	}
}