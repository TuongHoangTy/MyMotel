package com.HoangTy.motel.Controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.HoangTy.motel.Service.MotelService;
import com.HoangTy.motel.Entity.Motel;

import com.HoangTy.motel.Request.MotelReq;

@RestController
@RequestMapping("motel")
public class MotelController {

	@Autowired
	private MotelService motelService;

	@GetMapping
	public List<Motel> getMotels() {
		return motelService.getMotels();
	}
	
	@PostMapping
	public Motel createMotel(@RequestBody MotelReq motelReq) {
		return motelService.createMotel(motelReq);
	}
	
	@DeleteMapping("/{id}")
	public Motel deleteMotel(@PathVariable Long id) {
		return motelService.deleteMotel(id);
	}
	
	@PutMapping("/{id}")
	public Motel updateMotel(@PathVariable Long id, @RequestBody MotelReq motelReq) {
		return motelService.updateMotel(id,motelReq) ;
	}
}
