package com.pys.web.controller;

import com.pys.pojo.Users;
import com.pys.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: PYS
 * @Date: 2019/09/10/0010
 * @Description: com.pys.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        return "ok";
    }

}
