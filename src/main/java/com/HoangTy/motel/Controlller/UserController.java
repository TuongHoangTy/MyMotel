package com.HoangTy.motel.Controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.Service.AccoutsService;
import com.HoangTy.motel.table.User;

import request.UserReq;

@RestController
@RequestMapping("account")
public class UserController {
	
	@Autowired
	private AccoutsService accoutsService;;
	
	@GetMapping
	public List<AccountsRes> getAcounts() {
		return accoutsService.getAcounts();
	}
	
	@PostMapping
	public User create(@RequestBody UserReq userReq) {
		return accoutsService.create(userReq);
	}
}
