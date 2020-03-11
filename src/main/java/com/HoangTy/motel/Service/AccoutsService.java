package com.HoangTy.motel.Service;

import java.util.List;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.table.Motel;
import com.HoangTy.motel.table.User;

import request.DeleteMotel;
import request.InsertMotel;
import request.UpdateMotel;
import request.UserReq;
import request.UserReq1;
import request.UserReq2;

public interface AccoutsService {
	List<AccountsRes> getAcounts();
	User getAcount(Long id);
	User create(UserReq userReq);
	User update(UserReq1 userReq1);
	User delete(UserReq2 userReq2);
	
	
	Motel update1(UpdateMotel updateMotel);
	Motel insert1(InsertMotel insertMotel);
	Motel delete1(DeleteMotel deleteMotel);
	
}
