package com.account.dto;

public class Account implements Comparable<Account>{
	private int accNum;
	private String accName;
	private double accBalance;
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}
	
	public int compareTo(Account o) {		
		return this.accNum-o.accNum;
	}
	

}
