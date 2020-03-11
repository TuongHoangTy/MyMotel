package com.HoangTy.motel.Service;

import java.util.List;

import com.HoangTy.motel.table.Motel;

import request.DeleteMotel;
import request.InsertMotel;
import request.MotelReq;

public interface MotelService {
	List<Motel> getMotels();
	Motel createMotel(MotelReq motelReq);
	Motel deleteMotel(Long motelId);
	Motel updateMotel(Long motelId, MotelReq motelReq);
	Motel getMotel(Long id);
}
