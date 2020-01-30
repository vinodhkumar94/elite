package com.account.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.account.comparator.BalanceComparator;
import com.account.dao.AccountDAO;
import com.account.dto.Account;

public class AccountServiceImpl implements AccountService {
	AccountDAO accountDAO = new AccountDAO();

	public void insertAccount(Account account) {
		
		account.setAccBalance(account.getAccBalance() + 1000);
		System.out.println("I recieved " + account + "  from controller");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			System.out.println("I am passing " + account + " to DAO layer");
			accountDAO.insertAccount(account);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Account> selectAllAccount() {

		List<Account> accountlist = new ArrayList<Account>();
		try {
			accountlist = accountDAO.selectAllAccountRecords();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountlist;
	}

	public List<Account> selctAllByAccNumOrder() {
		AccountDAO accountDAO = new AccountDAO();
		List<Account> accountlist = new ArrayList<Account>();
		try {
			accountlist = accountDAO.selectAllAccountRecords();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return accountlist;
	}

	public List<Account> selectAllByBalanceOrder() {
		AccountDAO accountDAO = new AccountDAO();
		List<Account> accountlist = new ArrayList<Account>();
		try {
			accountlist = accountDAO.selectAllAccountRecords();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return accountlist;

	}
}
