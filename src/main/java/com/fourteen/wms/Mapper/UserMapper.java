package com.fourteen.wms.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fourteen.wms.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> listAll();
}
