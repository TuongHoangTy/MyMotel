package com.HoangTy.motel.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Address {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String number;
	@Column
	private String street;
	@Column
	private String lat;
	@Column
	private String log;
	@ManyToOne
	private Ward ward;
}
