package com.HoangTy.motel.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Manager {
	@Id
	@GeneratedValue
	private Long id;
	
	private String phone;
	
	@MapsId
	@OneToOne
	private User user;
}
