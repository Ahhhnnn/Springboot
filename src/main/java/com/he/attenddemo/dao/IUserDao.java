package com.he.attenddemo.dao;

import com.he.attenddemo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {
    User loadById(String id);

    List<User> findAll();

    int queryCount();
}
