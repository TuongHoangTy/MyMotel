package com.HoangTy.motel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HoangTy.motel.table.Motel;

public interface MotelRepo extends JpaRepository<Motel, Long>{

}
