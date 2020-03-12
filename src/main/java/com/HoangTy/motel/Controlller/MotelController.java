package com.HoangTy.motel.Controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.Service.AccoutsService;
import com.HoangTy.motel.Service.MotelService;
import com.HoangTy.motel.table.Motel;
import com.HoangTy.motel.table.User;

import request.MotelReq;

import request.UserReq;

@RestController
@RequestMapping
public class MotelController {

	@Autowired
	private MotelService motelService;

	@GetMapping("/motel")
	public List<Motel> getMotels() {
		return motelService.getMotels();
	}

	
	@PostMapping("/motel")
	public Motel createMotel(@RequestBody MotelReq motelReq) {
		return motelService.createMotel(motelReq);
	}
	
	@PostMapping("/motel")
	public Motel deleteMotel(@PathVariable Long id) {
		return motelService.deleteMotel(id);
	}
	
	
	@PutMapping("/{id}")
	public Motel updateMotel(@PathVariable Long id, @RequestBody MotelReq motelReq) {
		return motelService.updateMotel(id,motelReq) ;
	}
	
	
}
