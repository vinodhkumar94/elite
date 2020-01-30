package com.account.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.account.connectionutil.ConnectionUtil;
import com.account.dto.Account;

public class AccountDAO {

	Connection connection = null;
	Account account = null;

	public void insertAccount(Account account) throws SQLException {
		System.out.println("I recieved " + account + " from service layer");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection = ConnectionUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement("insert into account values(?,?,?)");
		ps.setInt(1, account.getAccNum());
		ps.setString(2, account.getAccName());
		ps.setDouble(3, account.getAccBalance());
		ps.execute();
		System.out.println("I executed the statement check in db");

	}

	public List<Account> selectAllAccountRecords() throws SQLException {

		connection = ConnectionUtil.getConnection();
		List<Account> accountList = new ArrayList<Account>();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select * from account order by accNum");
		while (rs.next()) {
			Account account = new Account();
			account.setAccNum(rs.getInt(1));
			account.setAccName(rs.getString(2));
			account.setAccBalance(rs.getDouble(3));
			accountList.add(account);
		}
		return accountList;

	}

}
