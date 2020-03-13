package com.HoangTy.motel.Service;

import java.util.List;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.Entity.User;

import com.HoangTy.motel.Request.UserReq;

public interface UserService {
	List<AccountsRes> getUsers();
	User getUser(Long id);
	User create(UserReq userReq);
	User update(Long id, UserReq userReq);
	User delete(Long id);
}
