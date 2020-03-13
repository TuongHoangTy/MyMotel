package com.HoangTy.motel.Controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.HoangTy.motel.Response.AccountsRes;
import com.HoangTy.motel.Service.UserService;
import com.HoangTy.motel.Entity.User;

import com.HoangTy.motel.Request.UserReq;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<AccountsRes> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public User create(@RequestBody UserReq userReq) {
        return userService.create(userReq);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody UserReq userReq) {
        return userService.update(id, userReq);
    }

    @DeleteMapping("/{id}")
    public User delete(@PathVariable Long id) {
        return userService.delete(id);
    }
}
