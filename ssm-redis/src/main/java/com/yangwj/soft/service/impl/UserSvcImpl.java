package com.yangwj.soft.service.impl;



import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.yangwj.soft.dao.UserMapper;
import com.yangwj.soft.entity.User;
import com.yangwj.soft.service.UserSvc;

@Service("userService")
public class UserSvcImpl implements UserSvc{

    @Resource
    private UserMapper userMapper;

    public User getUser(int id) {
        User user = null;
        try{
            user = userMapper.getUserById(id);
        }catch (DataAccessException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return user;
    }

}