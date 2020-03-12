package com.HoangTy.motel.Service;

import java.util.List;

import com.HoangTy.motel.table.Motel;
import com.HoangTy.motel.table.User;

import request.DeleteMotel;
import request.InsertMotel;
import request.MotelReq;
import request.UserReq;

public interface MotelService {
	List<Motel> getMotels();
	Motel createMotel(MotelReq motelReq);
	Motel deleteMotel(Long motelId);
	Motel updateMotel(MotelReq motelReq);
	Motel GetMotel(Long id);
	
}
