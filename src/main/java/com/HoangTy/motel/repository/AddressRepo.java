package com.HoangTy.motel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HoangTy.motel.table.Address;

public interface AddressRepo  extends JpaRepository<Address, Long>{

}
