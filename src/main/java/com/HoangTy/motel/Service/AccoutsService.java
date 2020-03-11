package com.HoangTy.motel.Service;

import java.util.List;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.table.User;

import request.UserReq;

public interface AccoutsService {
	List<AccountsRes> getAcounts();
	User getAcount(Long id);
	User create(UserReq userReq);
}
