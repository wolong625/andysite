package com.lang.andysite.user.dao;

import com.lang.andysite.modules.sys.dao.SysUserMapper;
import com.lang.andysite.modules.sys.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml"})
public class UserDaoTest {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void testUserInsert(){
        SysUser sysUser = new SysUser();
        sysUser.setId("10000");
        sysUser.setLoginName("chen");
        sysUser.setPassword("111");
        sysUser.setCreateDate(new Date());
        int insert = sysUserMapper.insert(sysUser);
        System.out.println("结果 ------ "+insert);
    }

}
