package com.HoangTy.motel.Request;

import lombok.Data;

@Data
public class UserReq {
	private String fullName;
	private String passWord;
	private String email;
}
