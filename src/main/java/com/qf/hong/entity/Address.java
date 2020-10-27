package com.qf.hong.entity;

import java.io.Serializable;

public class Address implements Serializable {
    /**
     *
     */
    private Integer addrId;

    /**
     * 用户对应的地址id
     */
    private Integer addrUserId;

    /**
     * 省份
     */
    private String addrProvince;

    /**
     * 市
     */
    private String addrCity;

    /**
     * 区
     */
    private String addrArea;

    /**
     * 详细地址
     */
    private String addrDetails;

    /**
     * 用户默认的地址状态 1表示默认 0表示不默认
     */
    private Integer addrAgree;

    /**
     * 状态值 0表示未删除 1表示已删除
     */
    private Integer addrStatus;

    private static final long serialVersionUID = 1L;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public Integer getAddrUserId() {
        return addrUserId;
    }

    public void setAddrUserId(Integer addrUserId) {
        this.addrUserId = addrUserId;
    }

    public String getAddrProvince() {
        return addrProvince;
    }

    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince;
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public String getAddrArea() {
        return addrArea;
    }

    public void setAddrArea(String addrArea) {
        this.addrArea = addrArea;
    }

    public String getAddrDetails() {
        return addrDetails;
    }

    public void setAddrDetails(String addrDetails) {
        this.addrDetails = addrDetails;
    }

    public Integer getAddrAgree() {
        return addrAgree;
    }

    public void setAddrAgree(Integer addrAgree) {
        this.addrAgree = addrAgree;
    }

    public Integer getAddrStatus() {
        return addrStatus;
    }

    public void setAddrStatus(Integer addrStatus) {
        this.addrStatus = addrStatus;
    }
}

