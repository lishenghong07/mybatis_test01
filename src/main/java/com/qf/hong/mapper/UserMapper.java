package com.qf.hong.mapper;

import com.qf.hong.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //通过id获取到User对象
    List<User> selectById(@Param("userId") int userId);
    //保存用户数据
    int insert(@Param("user") User user);
}
