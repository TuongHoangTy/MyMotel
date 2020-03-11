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
import com.HoangTy.motel.table.Motel;
import com.HoangTy.motel.table.User;

import request.InsertMotel;
import request.UpdateMotel;
import request.UserReq;
import request.UserReq1;
import request.UserReq2;

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
	
	
	@PostMapping
	public User create(@RequestBody UserReq1 userReq1) {
		return accoutsService.update(userReq1);
	}
	
	
	/*@PostMapping
	public User create(@RequestBody UserReq2 userReq2) {
		return accoutsService.delete(userReq2);
	}
	
	
	

	@PostMapping
	public Motel insert(@RequestBody InsertMotel insertMotel)
	{
		return accoutsService.insert1(insertMotel);
		
	}
	
	@PostMapping
	public Motel update(@RequestBody UpdateMotel updatetMotel)
	{
		return accoutsService.update1(updatetMotel);
		
	}*/
	
}
