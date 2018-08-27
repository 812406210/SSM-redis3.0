package com.yangwj.soft.controller;


import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yangwj.soft.entity.User;
import com.yangwj.soft.service.UserSvc;

@Controller
public class UserController {

    @Resource
    private UserSvc userSvc;

    @RequestMapping(value="/toQueryUser")
    public ModelAndView toQueryUser(){
        User user = userSvc.getUser(2);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", user);
        return new ModelAndView("/pc/userTest", map);
    }
}
