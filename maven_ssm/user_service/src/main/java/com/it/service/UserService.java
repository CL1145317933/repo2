package com.it.service;

import com.it.domain.User;

import java.util.List;

/**
 * 用户service层接口
 */
public interface UserService {

    List<User> findAll();
}
