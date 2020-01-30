package com.aadhaar.service;

import java.util.List;

import com.aadhaar.DTO.Aadhaar;


public interface Aadhaar_Service 
{
	public void insertAadhaar(Aadhaar aadhaar);
	public void updateAadhaar(Aadhaar aadhaar);
	public Aadhaar selectAllByAadhaarIdOrder(int aid);
	public void deleteAadhaar(int aid);
	public List<Aadhaar> selectAllAadhaar();
	public List<Aadhaar> selctAllByAadhaarNumOrder();
	public List<Aadhaar> selectAllByAadhaarMobileNumOrder();
	public List<Aadhaar> selectAllByAadhaarAgeOrder();
	public List<Aadhaar> selectAllByAadhaarGenderOrder();
	public List<Aadhaar> selectAllByAadhaarDobOrder();
	public List<Aadhaar> selectAllByAadhaarMstatusOrder();
	public List<Aadhaar> selectAllByAadhaarStateOrder();
	public List<Aadhaar> selectAllByAadhaarEmailIdOrder();
	public List<Aadhaar> selectAllByAadhaarAddressOrder();
	
	
}
	
