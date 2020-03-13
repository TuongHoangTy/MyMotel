package com.HoangTy.motel.Response;

import com.HoangTy.motel.Entity.User;

import lombok.Data;

@Data
public class AccountsRes {
	private Long id;
	private String passWord;
	private String name;
	private String email;

	public static AccountsRes fromModel(User account) {
		AccountsRes accountsRes = new AccountsRes();
		accountsRes.setId(account.getId());
		accountsRes.setPassWord(account.getPassWord());
		accountsRes.setEmail(account.getEmail());
		accountsRes.setName(account.getFullName());
		return accountsRes;
	}
}
