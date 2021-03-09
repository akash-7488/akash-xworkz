package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.Dao.HospitalDto;
import com.xworkz.xworkzapp.Service.HospitalServiceImpl;

public class Hospitaltester {

	public static void main(String[] args) {
		HospitalDto dto = new HospitalDto("2525a", "jk", "bidar", "akash", "8880062564");
		HospitalDto dto1 = new HospitalDto("2525b", "esi", "aurad", "vijay", "6364259965");
		HospitalDto dto2 = new HospitalDto("2525c", "sky", "bidar", "amar", "9986337266");
      
		
		HospitalServiceImpl daoImpl = new HospitalServiceImpl();
       
      daoImpl.isvalidateaddHospitalDao(dto);
      daoImpl.DisplayHospitaldetails();

		  daoImpl.isvalidateaddHospitalDao(dto1);
		  daoImpl.isvalidateaddHospitalDao(dto2);
                  daoImpl.DisplayHospitaldetails();
		  daoImpl.DisplayHospitaldetails(); 
                  daoImpl.updteHospitalDetails("2525b","hasan");
                  daoImpl.DisplayHospitaldetails();
		  daoImpl.deleteHospitalDetails("jk"); 
                  daoImpl.DisplayHospitaldetails();
		
      
      
       
	}

}
