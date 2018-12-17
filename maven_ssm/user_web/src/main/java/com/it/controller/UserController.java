package com.it.controller;

import com.it.domain.User;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("findAll.do")
    public String findAll(Model model){
        List<User> list = service.findAll();
        model.addAttribute("list",list);
        return "success";
    }
}
