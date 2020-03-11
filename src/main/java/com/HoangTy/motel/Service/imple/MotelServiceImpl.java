package com.HoangTy.motel.Service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HoangTy.motel.Service.MotelService;
import com.HoangTy.motel.repository.AddressRepo;
import com.HoangTy.motel.repository.ManagerRepo;
import com.HoangTy.motel.repository.MotelRepo;
import com.HoangTy.motel.table.Address;
import com.HoangTy.motel.table.Manager;
import com.HoangTy.motel.table.Motel;

import request.MotelReq;

@Service
public class MotelServiceImpl implements MotelService{

	@Autowired
	private MotelRepo motelRepo;
	
	@Autowired
	private AddressRepo  addressRepo;

	@Autowired
	private ManagerRepo  managerRepo;
	
	
	@Override
	public List<Motel> getMotels() {
		// TODO Auto-generated method stub
		return motelRepo.findAll();
	}

	@Override
	public Motel createMotel(MotelReq motelReq) {
		//find Address
		Address address = addressRepo.findById(motelReq.getAddressId()).get();
		
		
		//find Manager
		Manager manager = managerRepo.findById(motelReq.getManageId()).get();
		
		Motel motel = new Motel();
		motel.setName(motelReq.getName());
		motel.setAddress(address);
		motel.setManager(manager);
		
		Motel pre  = motelRepo.save(motel);
		
		return pre;
	}

	@Override
	public Motel deleteMotel(Long motelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Motel updateMotel(Long motelId, MotelReq motelReq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Motel getMotel(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
