package com.account.comparator;

import java.util.Comparator;

import com.account.dto.Account;

public class NameComparator implements Comparator<Account>{

	public int compare(Account o1, Account o2) {
		
		return o1.getAccName().compareTo(o2.getAccName());
	}

	

}
