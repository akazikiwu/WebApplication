package com.fourteen.wms.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fourteen.wms.Entity.User;
import com.fourteen.wms.Mapper.UserMapper;
import com.fourteen.wms.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> listAll() {
        return userMapper.listAll();
    }
}
