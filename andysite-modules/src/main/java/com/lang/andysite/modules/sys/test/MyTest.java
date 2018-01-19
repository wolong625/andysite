package com.lang.andysite.modules.sys.test;

import com.lang.andysite.modules.sys.dao.SysUserMapper;
import com.lang.andysite.modules.sys.entity.SysUser;
import com.lang.andysite.modules.sys.service.SysUserService;
import com.lang.andysite.modules.sys.service.impl.SysUserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;


public class MyTest {

    public static void main(String[] args) {
        SysUserService sysUserService = new SysUserServiceImpl();
        SysUser sysUser = new SysUser();
        sysUser.setId("10000");
        sysUser.setLoginName("chen");
        sysUser.setPassword("111");
        sysUserService.insertSysUser(sysUser);
    }
}
