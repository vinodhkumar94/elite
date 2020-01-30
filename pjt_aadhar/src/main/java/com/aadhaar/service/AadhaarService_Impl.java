package com.aadhaar.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aadhaar.DAO.Aadhar_DAO;
import com.aadhaar.DTO.Aadhaar;


public class AadhaarService_Impl  implements Aadhaar_Service{
	Aadhar_DAO aadhaardao = new Aadhar_DAO();
	public List<Aadhaar> selectAllAadhaar(List<Aadhaar> Aadhaar) {
		// TODO Auto-generated method stub
		try {
			aadhaardao.selectAllAadhaarRecords();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Aadhaar;
	}

	public void insertAadhaar(Aadhaar aadhaar)
	{
		aadhaar.setAid(aadhaar.getAid());
		aadhaar.setName(aadhaar.getName());
		aadhaar.setAge(aadhaar.getAge());
		aadhaar.setEmail_id(aadhaar.getEmail_id());
		aadhaar.setGender(aadhaar.getGender());
		aadhaar.setM_status(aadhaar.getM_status());
		aadhaar.setPhone_num(aadhaar.getPhone_num());
		aadhaar.setState(aadhaar.getState());
		
		try {
			Thread.sleep(500);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			aadhaardao.insertAadhaar(aadhaar);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Aadhaar> selctAllByAadhaarNumOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}
	
	public List<Aadhaar> selectAllByAadhaarMobileNumOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}

	public List<Aadhaar> selectAllByAadhaarAgeOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}

	public List<Aadhaar> selectAllByAadhaarIdOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}

	public List<Aadhaar> selectAllByAadhaarGenderOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}

	public List<Aadhaar> selectAllByAadhaarDobOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}

	public List<Aadhaar> selectAllByAadhaarMstatusOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}

	public List<Aadhaar> selectAllByAadhaarStateOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}

	public List<Aadhaar> selectAllByAadhaarEmailIdOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}

	public List<Aadhaar> selectAllByAadhaarAddressOrder() {
		Aadhar_DAO aadhaardao = new Aadhar_DAO();
		List<Aadhaar> aadhaarlist = new ArrayList<Aadhaar>();
		try {
			aadhaarlist = aadhaardao.selectAllAadhaarRecords();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return aadhaarlist;
	}

	public void updateAadhaar(Aadhaar aadhaar)
	{
		
	}

	

	public void deleteAadhaar(int aid) 
	{
		
	}

	public Aadhaar selectAllByAadhaarIdOrder(int aid)
	{
		return null;
	}

	public List<Aadhaar> selectAllAadhaar() {
		// TODO Auto-generated method stub
		return null;
	}

	}
