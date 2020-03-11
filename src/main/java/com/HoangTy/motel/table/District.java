package com.HoangTy.motel.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class District {
	@Id
	@GeneratedValue
	private int id;

	private String name;

	@ManyToOne
	private City city;
}
