package com.xworkz.xworkzapp.Dao;

public class HospitalDaoImpl implements HospitalDao {
	
	 HospitalDto hospitaldto[] = new HospitalDto[3];
	 int index = 0;
	 
	@Override
	public void addHospitalDao(HospitalDto dto) {
		hospitaldto[index] =dto;
		index++;
		System.out.println("added hospital details");
		
	}
	@Override
	public void displayHospitalDetails() {
		System.out.println("hospital detai;s displayed");
	  for (int i = 0; i < index; i++) {
		   
		  System.out.println("Hospital licence is :" + hospitaldto[i].getLicence());
		  System.out.println("Hospital name is :"+ hospitaldto[i].getName());
		  System.out.println("Hospital location is :"+ hospitaldto[i].getLocation());
		  System.out.println("Hospital founder is :"+ hospitaldto[i].getFounder());
		  System.out.println("Hospital phone is :"+ hospitaldto[i].getPhone());
		  
		  
	
		
	  }
  }
	
	@Override
	public void updteHospitalDetails(String licene, String loc) {
		for (int i = 0; i < index; i++) {

			if (hospitaldto[i].getLicence().equals(licene)) {
				hospitaldto[i].setLocation(loc);
				System.out.println("Update successfull...!");
			} else {
				System.out.println("invalid licence number");
			}

		}
	}

	@Override
	public void deleteHospitalDetails(String nm) {
		for (int i = 0; i < index; i++) {

			if (hospitaldto[i].getName().equals(nm)) {
				hospitaldto[i] = null;

				System.out.println("delete successfull...!");
			} else {
				System.out.println("invalid name");
			}
		}
	}

	@Override
	public void showDetails(String licene, String name) {
		System.out.println("passing 2 parameters ");
		for (int i = 0; i < index; i++) {
			if(hospitaldto[i]!=null) {
			if (hospitaldto[i].getLicence().equals(licene) && hospitaldto[i].getName().equals(name) ) {
				System.out.println("licence number : " + hospitaldto[i].getLicence());
				System.out.println("Hospital Name  	: " + hospitaldto[i].getName());
				System.out.println("Hospital Location  : " + hospitaldto[i].getLocation());
			}else {
				System.out.println("plzz enter valid input");
			}

		}
		}
	}
	
}



