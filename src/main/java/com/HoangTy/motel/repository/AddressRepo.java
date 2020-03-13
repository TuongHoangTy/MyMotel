package com.HoangTy.motel.Repository;

import com.HoangTy.motel.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo  extends JpaRepository<Address, Long>{
}
