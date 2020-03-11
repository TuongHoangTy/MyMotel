package com.HoangTy.motel.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Motel {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@ManyToOne
	private Manager manager;
	
	@ManyToOne
	private Address address;
}
