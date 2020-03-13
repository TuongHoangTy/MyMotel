package com.HoangTy.motel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HoangTy.motel.Entity.Manager;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepo  extends JpaRepository<Manager, Long>{
}
