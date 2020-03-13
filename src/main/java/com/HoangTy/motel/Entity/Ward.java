package com.HoangTy.motel.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Ward {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;

	@ManyToOne
    private District district;
}
