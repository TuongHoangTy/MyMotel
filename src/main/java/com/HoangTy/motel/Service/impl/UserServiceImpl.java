package com.HoangTy.motel.Service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.Service.UserService;
import com.HoangTy.motel.Repository.UserRepository;
import com.HoangTy.motel.Entity.User;

import com.HoangTy.motel.Request.UserReq;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	public List<AccountsRes> getUsers() {
		return userRepository.findAll().stream().map(AccountsRes::fromModel).collect(Collectors.toList());
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public User create(UserReq userReq) {
		User user = new User();
		user.setEmail(userReq.getEmail());
		user.setFullName(userReq.getFullName());
		user.setPassWord(userReq.getPassWord());
		User pre = userRepository.save(user);

		return pre;
	}

	@Override
	@Transactional
	public User update(Long id, UserReq userReq) {
		User user = getUser(id);
		user.setEmail(userReq.getEmail());
		user.setFullName(userReq.getFullName());
		user.setPassWord(userReq.getPassWord());
		return user;
	}

	@Override
	public User delete(Long id) {
		User user = getUser(id);
		userRepository.delete(user);
		return user;
	}
}
