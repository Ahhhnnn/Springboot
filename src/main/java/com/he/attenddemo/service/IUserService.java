package com.he.attenddemo.service;

import com.he.attenddemo.model.User;

import java.util.List;

public interface IUserService {

    public User loadById(String id);
    public List<User> findAll();
}
