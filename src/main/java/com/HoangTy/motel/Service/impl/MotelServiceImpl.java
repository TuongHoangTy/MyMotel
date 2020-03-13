package com.HoangTy.motel.Service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HoangTy.motel.Service.MotelService;
import com.HoangTy.motel.Repository.AddressRepo;
import com.HoangTy.motel.Repository.ManagerRepo;
import com.HoangTy.motel.Repository.MotelRepo;
import com.HoangTy.motel.Entity.Address;
import com.HoangTy.motel.Entity.Manager;
import com.HoangTy.motel.Entity.Motel;
import com.HoangTy.motel.Request.MotelReq;

@Service
public class MotelServiceImpl implements MotelService {

	@Autowired
	private MotelRepo motelRepo;

	@Autowired
	private AddressRepo addressRepo;

	@Autowired
	private ManagerRepo managerRepo;

	@Override
	public List<Motel> getMotels() {
		// TODO Auto-generated method stub
		return motelRepo.findAll();
	}

	@Override
	public Motel createMotel(MotelReq motelReq) {
		// find Address
		Address address = addressRepo.findById(motelReq.getAddressId()).get();

		// find Manager
		Manager manager = managerRepo.findById(motelReq.getManagerId()).get();

		Motel motel = new Motel();
		motel.setName(motelReq.getName());
		motel.setAddress(address);
		motel.setManager(manager);

		Motel pre = motelRepo.save(motel);
		return pre;
	}

	@Override
	public Motel deleteMotel(Long motelId) {
		return motelRepo.findById(motelId).get();
	}

	@Override
	public Motel getMotel(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Motel updateMotel(Long id, MotelReq motelReq) {
		// TODO Auto-generated method stub
		Motel motel = getMotel(id);
		Address address = addressRepo.findById(motelReq.getAddressId()).get();
		Manager manager = managerRepo.findById(motelReq.getManagerId()).get();
		motel.setName(motelReq.getName());
		motel.setAddress(address);
		motel.setManager(manager);
		Motel pre = motelRepo.save(motel);
		return pre;
	}

}
