package com.HoangTy.motel.Controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.Service.AccoutsService;
import com.HoangTy.motel.Service.MotelService;
import com.HoangTy.motel.table.Motel;

@RestController
@RequestMapping
public class MotelController {

	@Autowired
	private MotelService motelService;
	
	@Autowired
	private AccoutsService accoutsService;;

	@GetMapping("/motel")
	public List<Motel> getMotels() {
		return motelService.getMotels();

	}

	@GetMapping("/account")
	public List<AccountsRes> getAcounts() {
		return accoutsService.getAcounts();
	}

}
