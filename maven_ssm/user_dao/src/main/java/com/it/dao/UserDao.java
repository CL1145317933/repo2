package com.it.dao;

import com.it.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户dao层接口
 */
public interface UserDao {

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();
}
