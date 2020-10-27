package com.qf.hong.mapper;

import com.qf.hong.entity.Address;
import com.qf.hong.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
    //通过用户id获取对应的地址
   List<Address> selectByUserId(@Param("userId") int userId);
   //添加地址
    int insert(@Param("addr") Address address);
}
