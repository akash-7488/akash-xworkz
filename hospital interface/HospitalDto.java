package com.xworkz.xworkzapp.Dao;

public class HospitalDto {
	private String licence;
	private String name;
	private String location;
	private String founder;
	private String phone;
	public HospitalDto(String licence, String name, String location, String founder, String phone) {
		this.licence = licence;
		this.name = name;
		this.location = location;
		this.founder = founder;
		this.phone = phone;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
