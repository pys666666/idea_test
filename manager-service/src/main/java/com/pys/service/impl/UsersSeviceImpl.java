package com.pys.service.impl;

import com.pys.mapper.UsersMapper;
import com.pys.pojo.Users;
import com.pys.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: PYS
 * @Date: 2019/09/10/0010
 * @Description: com.pys.service.impl
 * @version: 1.0
 */
@Service
public class UsersSeviceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
