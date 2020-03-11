package com.HoangTy.motel.Service.imple;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.Service.AccoutsService;
import com.HoangTy.motel.repository.AccoutsRepository;
import com.HoangTy.motel.table.Motel;
import com.HoangTy.motel.table.User;

import request.DeleteMotel;
import request.InsertMotel;
import request.UpdateMotel;
import request.UserReq;
import request.UserReq1;
import request.UserReq2;

@Service
public class AccountsServiceImplement implements AccoutsService {
	@Autowired
	private AccoutsRepository accoutsRepository;

	public List<AccountsRes> getAcounts() {
		return accoutsRepository.findAll().stream().map(AccountsRes::fromModel).collect(Collectors.toList());
	}

	@Override
	public User getAcount(Long id) {
		// TODO Auto-generated method stub
		return accoutsRepository.findById(id).get();
	}

	@Override
	public User create(UserReq userReq) {
		User user = new User();
		user.setEmail(userReq.getEmail());
		user.setFullName(userReq.getFullName());
		user.setPassWord(userReq.getPassWord());
		User pre = accoutsRepository.save(user);

		return pre;
	}
	// @Query("delete User u where ")

	@Override
	@Transactional
	public User update(UserReq1 userReq1) {
		User user = getAcount(userReq1.getId());
		user.setEmail(userReq1.getEmail());
		user.setFullName(userReq1.getFullName());
		user.setPassWord(userReq1.getPassWord());
		return user;
	}

	public Motel update1(UpdateMotel updateMotel) { // TODO Auto-generated method
		return null;
	}

	@Override
	public Motel insert1(InsertMotel insertMotel) { // TODO
		return null;
	}

	@Override
	public Motel delete1(DeleteMotel deleteMotel) { // TODO
		return null;
	}

	@Override
	public User delete(UserReq2 userReq2) 
	{
		
		return null;
	}

}
