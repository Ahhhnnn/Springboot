package com.he.attenddemo.serviceimpl;

import com.he.attenddemo.dao.IUserDao;
import com.he.attenddemo.model.User;
import com.he.attenddemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public User loadById(String id) {
        return userDao.loadById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public int queryCount() {
        return userDao.queryCount();
    }
}
