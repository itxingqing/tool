package com.tta.tool.service;

/**
 * 泄露人员信息的规则定义类
 */
public interface HotelServiceI {

    public void addDiscloseData(String key, String name);

    public String getDiscloseData(String key);

}
