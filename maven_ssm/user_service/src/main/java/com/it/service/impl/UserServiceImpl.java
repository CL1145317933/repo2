package com.it.service.impl;

import com.it.dao.UserDao;
import com.it.domain.User;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service层实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    public List<User> findAll() {
        return dao.findAll();
    }
}
