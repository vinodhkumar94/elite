package com.aadhaar.DAO;

import java.sql.*;

import java.util.*;

import com.aadhaar.DTO.Aadhaar;
import com.aadhaar.util.ConnectionUtil;
public class Aadhar_DAO
{
	Connection connection = null;
	Aadhaar aadhaar = null;
	PreparedStatement pstmt = null;

	public void insertAadhaar(Aadhaar aadhaar) throws SQLException {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		connection = ConnectionUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement("insert into account values(?,?,?)");
		ps.setInt(1, aadhaar.getAid());
		ps.setString(2, aadhaar.getName());
		ps.setInt(3, aadhaar.getAge());
		ps.setString(4,aadhaar.getGender());
		ps.setLong(5, aadhaar.getPhone_num());
		ps.setString(6, aadhaar.getEmail_id());
		ps.setString(8,aadhaar.getM_status());
		ps.setString(9, aadhaar.getState());
		
		ps.execute();

	}

	public List<Aadhaar> selectAllAadhaarRecords() throws SQLException {

		connection = ConnectionUtil.getConnection();
		List<Aadhaar> aadhaarList = new ArrayList<Aadhaar>();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select * from aadhaar order by aid");
		while (rs.next()) {
			Aadhaar aadhaar = new Aadhaar();
			aadhaar.setAid(rs.getInt(1));
			aadhaar.setName(rs.getString(2));
			aadhaar.setAge(rs.getInt(3));
			aadhaar.setGender(rs.getString(4));
			aadhaar.setPhone_num(rs.getInt(5));
			aadhaar.setEmail_id(rs.getString(6));
			aadhaar.setM_status(rs.getString(8));
			aadhaar.setState(rs.getString(9));
			aadhaarList.add(aadhaar);
		}
		return aadhaarList;

	}
}
