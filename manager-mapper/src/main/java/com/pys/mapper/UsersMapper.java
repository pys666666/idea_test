package com.pys.mapper;

import com.pys.pojo.Users;

import java.util.List;

/**
 * @Auther: PYS
 * @Date: 2019/09/10/0010
 * @Description: com.pys.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
