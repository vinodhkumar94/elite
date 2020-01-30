package com.account.comparator;

import java.util.Comparator;

import com.account.dto.Account;

public class BalanceComparator implements Comparator<Account> {

	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getAccBalance()-o2.getAccBalance());
	}

}
