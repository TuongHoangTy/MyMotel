package com.HoangTy.motel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.table.User;


@Repository
public interface AccoutsRepository extends JpaRepository<User, Long> {

}
