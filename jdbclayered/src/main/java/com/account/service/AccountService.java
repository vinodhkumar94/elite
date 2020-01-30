package com.account.service;

import java.util.List;

import com.account.dto.Account;

public interface AccountService {
	public void insertAccount(Account account);
	public List<Account> selectAllAccount();
	public List<Account> selctAllByAccNumOrder();
	public List<Account> selectAllByBalanceOrder();
}
