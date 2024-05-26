package com.fourteen.wms.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fourteen.wms.Entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> listAll();
}
