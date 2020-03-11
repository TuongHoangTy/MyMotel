package com.HoangTy.motel.table;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Convenient {
	@Id
	private int id;

	private String name;
}
