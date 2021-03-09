package com.xworkz.xworkzapp.Service;

import com.xworkz.xworkzapp.Dao.HospitalDto;

public interface HospitalService {
	

	public void DisplayHospitaldetails();
	public void updteHospitalDetails(String licene, String location);
	public void deleteHospitalDetails(String name);
	public void showDetails(String licence, String name);
	public boolean isvalidateaddHospitalDao(HospitalDto dto);
	

}
