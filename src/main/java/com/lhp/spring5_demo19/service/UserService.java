package com.lhp.spring5_demo19.service;

import com.lhp.spring5_demo19.bean.User;
import com.lhp.spring5_demo19.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author 53137
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int addUser(User user) {
        return userDao.addUser(user);
    }
}