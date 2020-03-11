package com.HoangTy.motel.Response;

import com.HoangTy.motel.table.User;

import lombok.Data;

@Data
public class AccountsRes {
	private Long id;
	private String passWord;
	
    
    public static AccountsRes fromModel(User account) {
    	
    	//AcountRes acountRes = new AcountRes();
    	//acountRes.setFirstName(account.getFirstName());
    	//acountRes.setEmail(account.getEmail());
    	//acountRes.setId(account.getId());
    	
    	//return acountRes;
    	
    	AccountsRes accout= new AccountsRes();
    	accout.setId(account.getId());
    	accout.setPassWord(account.getPassWord());
    	return accout;
    }

}
