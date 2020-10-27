package com.qf.hong;

import com.qf.hong.entity.Address;
import com.qf.hong.entity.User;
import com.qf.hong.mapper.AddressMapper;
import com.qf.hong.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        //创建工厂
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        //选择默认提交
        SqlSession sqlSession = ssf.openSession(true);
        //获取到主表的mapper对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //获取到从表的mapper对象
        final AddressMapper addressMapper = sqlSession.getMapper(AddressMapper.class);
        //保存主表的数据
        //创建主表内容
        final User user = new User();
        //设置主表内容
        user.setUserName("腻腻");
        user.setUserPhone(123456);
        userMapper.insert(user);
        System.out.println("用户的id:"+user.getUserId());
        //创建从表内容
        Address address = new Address();
        //设置从表内容
        address.setAddrUserId(user.getUserId());
        address.setAddrProvince("广东省");
        address.setAddrCity("广州市");
        address.setAddrArea("天河区");
        address.setAddrDetails("天慧广场");
        address.setAddrAgree(0);
        addressMapper.insert(address);
        //查询主表
        List<User> userList = userMapper.selectById(user.getUserId());
        //根据主表的id来进行从表的查询
        userList.forEach(u->{
            List<Address> addresses = addressMapper.selectByUserId(user.getUserId());
            u.setAddresslist(addresses);
        });
        System.out.println(user);
    }
}
