package com.HoangTy.motel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HoangTy.motel.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
