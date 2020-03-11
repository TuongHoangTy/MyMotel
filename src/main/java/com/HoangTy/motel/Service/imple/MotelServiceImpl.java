package com.HoangTy.motel.Service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HoangTy.motel.Service.MotelService;
import com.HoangTy.motel.repository.MotelRepo;
import com.HoangTy.motel.table.Motel;

@Service
public class MotelServiceImpl implements MotelService{

	@Autowired
	private MotelRepo motelRepo;

	@Override
	public List<Motel> getMotels() {
		// TODO Auto-generated method stub
		return motelRepo.findAll();
	}

}
