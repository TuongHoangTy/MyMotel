package com.HoangTy.motel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HoangTy.motel.Entity.Motel;
import org.springframework.stereotype.Repository;

@Repository
public interface MotelRepo extends JpaRepository<Motel, Long>{
}
