package com.HoangTy.motel.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class City {
	@Id
	@GeneratedValue
	private int id;

	private String name;

}
