package com.qf.hong.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    /**
     *
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户手机号
     */
    private Integer userPhone;

    /**
     * 状态值 0表示未删除 1表示已删除
     */
    private Integer userStatus;

    public List<Address> getAddresslist() {
        return addresslist;
    }

    public void setAddresslist(List<Address> addresslist) {
        this.addresslist = addresslist;
    }

    private List<Address> addresslist;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}

