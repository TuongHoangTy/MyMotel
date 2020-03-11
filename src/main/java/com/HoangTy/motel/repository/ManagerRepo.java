package com.HoangTy.motel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HoangTy.motel.table.Manager;

public interface ManagerRepo  extends JpaRepository<Manager, Long>{

}
