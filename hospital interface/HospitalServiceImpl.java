package com.xworkz.xworkzapp.Service;

import com.xworkz.xworkzapp.Dao.HospitalDaoImpl;
import com.xworkz.xworkzapp.Dao.HospitalDto;

public class HospitalServiceImpl implements HospitalService {
    HospitalDaoImpl impl = new HospitalDaoImpl();
    
    
	@Override
	public boolean isvalidateaddHospitalDao(HospitalDto dto) {
		boolean isvalidate = true;
		if (dto.getLicence() == null && dto.getLicence().length()!=8) {
			System.out.println("enter vailid licence number");
		isvalidate = false;
		return isvalidate;
		}
		
		if (dto.getName() == null && dto.getName().length()<6) {
			System.out.println("invalid name");
			isvalidate = false;
		return isvalidate;
		}
		
		if (dto.getLocation() == null && dto.getLocation().length()<5) {
			System.out.println("location not found, give valid location");
			isvalidate = false;
		return isvalidate;
		}
		if (dto.getFounder() == null && dto.getFounder().length()<5) {
			System.out.println("give valid name");
			isvalidate = false;
		return isvalidate;
		}
		
		if (dto.getPhone() == null && dto.getPhone().length()<10) {
			System.out.println("invalid Number");
			isvalidate = false;
		return isvalidate;
		}
		return isvalidate;
	}


	@Override
	public void DisplayHospitaldetails() {
		System.out.println("Display Hospital Details serviceimpl");
		impl.displayHospitalDetails();
		
	}


	@Override
	public void updteHospitalDetails(String licene, String location) {
		System.out.println("Update the details");
		if (licene != null)
			impl.updteHospitalDetails(licene, location);
		
	}


	@Override
	public void deleteHospitalDetails(String name) {
		if (name != null) {
			impl.deleteHospitalDetails(name);
		} else {
			System.out.println("invalid method");

		}
		
	}


	@Override
	public void showDetails(String licence, String name) {
		if (licence != null) {
			impl.showDetails(licence, name);
		
	}

	}	
	
}