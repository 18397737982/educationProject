package com.gy.beans;

import java.math.BigDecimal;

public class Account {
	private Admin stu_user;
	private BigDecimal balance;
	public Admin getStu_user() {
		return stu_user;
	}
	public void setStu_user(Admin stu_user) {
		this.stu_user = stu_user;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [stu_user=" + stu_user + ", balance=" + balance + "]";
	}
	

}
