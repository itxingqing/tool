package com.tta.tool.model;

/**
 * 人员的页面和数据库持久化模型类
 * Created by ts0002 on 2019/8/27.
 */
public class Person {

    private String id;
    private String name;
    private String phoneNumber;
    private String idCard;
    private String passport;
    //GET SET METHOD

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
