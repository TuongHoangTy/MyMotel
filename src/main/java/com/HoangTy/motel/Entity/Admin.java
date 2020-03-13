package com.HoangTy.motel.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Admin {
	@Id
	private Long id;
	private String phone;
	@MapsId
	@OneToOne
	private User user;
}
