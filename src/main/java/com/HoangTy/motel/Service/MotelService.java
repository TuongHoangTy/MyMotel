package com.HoangTy.motel.Service;

import java.util.List;

import com.HoangTy.motel.Entity.Motel;
import com.HoangTy.motel.Request.MotelReq;

public interface MotelService {
	List<Motel> getMotels();
	Motel createMotel(MotelReq motelReq);
	Motel deleteMotel(Long motelId);
	Motel updateMotel(Long id, MotelReq motelReq);
	Motel GetMotel(Long id);
}
