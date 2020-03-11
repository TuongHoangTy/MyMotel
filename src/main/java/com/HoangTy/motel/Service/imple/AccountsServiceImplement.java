package com.HoangTy.motel.Service.imple;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.Service.AccoutsService;
import com.HoangTy.motel.repository.AccoutsRepository;
import com.HoangTy.motel.table.User;


@Service
public class AccountsServiceImplement implements AccoutsService {
	@Autowired
	private AccoutsRepository accoutsRepository;
	
	public List<AccountsRes> getAcounts(){
		return accoutsRepository.findAll().stream().map(AccountsRes::fromModel).collect(Collectors.toList());
	}

	@Override
	public User getAcount(Long id) {
		// TODO Auto-generated method stub
		return accoutsRepository.findById(id).get();
	}

}
