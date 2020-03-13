package com.HoangTy.motel.Request;

import lombok.Data;

@Data
public class MotelReq {
	private Long id;
	private String name;
	private Long ManagerId;
	private Long AddressId;

}
