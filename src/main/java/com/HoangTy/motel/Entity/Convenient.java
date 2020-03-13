package com.HoangTy.motel.Entity;

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
