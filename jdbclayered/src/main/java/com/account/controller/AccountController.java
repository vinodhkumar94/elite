package com.account.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.account.comparator.BalanceComparator;
import com.account.comparator.NameComparator;
import com.account.dto.Account;
import com.account.service.AccountServiceImpl;

public class AccountController {

	public static void main(String[] args) {
		AccountServiceImpl serviceImpl = new AccountServiceImpl();
		List<Account> accountList = new ArrayList<Account>();
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("******MENU*******");
			System.out.println("1.Insert an account");
			System.out.println("2.select all accounts");
			System.out.println("3.select all by account number order");
			System.out.println("4.select all by balance ordet");
			System.out.println("5.select all by name order");
			System.out.println("6.exit");
			System.out.println("select your choice from 1 to 5 only");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("enetr account number");
				account.setAccNum(sc.nextInt());
				System.out.println("eneter account name");
				account.setAccName(sc.next());
				System.out.println("enter balance");
				account.setAccBalance(sc.nextDouble());
				serviceImpl.insertAccount(account);
				System.out.println("Inserted successfully");
				break;

			case 2:
				System.out.println("select all object from db");
				accountList = serviceImpl.selectAllAccount();
				for (Account account1 : accountList)
					System.out.println(account1);
				break;
			case 3:
				System.out.println("select all object from db in account number order");
				accountList = serviceImpl.selctAllByAccNumOrder();
				Collections.sort(accountList);
				for (Account account1 : accountList)
					System.out.println(account1);
				break;
			case 4:
				System.out.println("select all object from db in balance  order");
				accountList = serviceImpl.selectAllByBalanceOrder();
				Collections.sort(accountList, new BalanceComparator());
				for (Account account1 : accountList)
					System.out.println(account1);
				break;
			case 5:
				System.out.println("select all object from db in name order");
				accountList = serviceImpl.selectAllByBalanceOrder();
				Collections.sort(accountList, new NameComparator());
				for (Account account1 : accountList)
					System.out.println(account1);
				break;
			case 6:
				System.out.println("exit");
				break;
			}

		} while (choice != 6);
		sc.close();

	}
}
