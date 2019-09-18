package com.pys.test;

import com.pys.mapper.UsersMapper;
import com.pys.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: PYS
 * @Date: 2019/09/10/0010
 * @Description: com.pys.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users=new Users();
        users.setUserage(22);
        users.setUsername("admin");
        this.usersMapper.insertUser(users);
    }
}
