package com.xworkz.xworkzapp.Dao;

public interface HospitalDao {
	
	public void addHospitalDao(HospitalDto dto);
	public void displayHospitalDetails();
	public void updteHospitalDetails(String licene, String location);
	public void deleteHospitalDetails(String name);
	public void showDetails(String licene, String name);


	

}
