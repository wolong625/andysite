package com.lang.andysite.modules.sys.service.impl;

import com.lang.andysite.modules.sys.dao.SysUserMapper;
import com.lang.andysite.modules.sys.entity.SysUser;
import com.lang.andysite.modules.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void insertSysUser(SysUser sysUser) {

        sysUserMapper.insert(sysUser);

    }
}
