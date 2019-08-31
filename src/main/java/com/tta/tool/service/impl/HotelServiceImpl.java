package com.tta.tool.service.impl;

import com.tta.tool.service.HotelServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 泄露数据的业务逻辑处理类
 */
@Service
public class HotelServiceImpl implements HotelServiceI {
    //处理redis的模板类
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void addDiscloseData(String key, String name) {
        stringRedisTemplate.opsForValue().set(key, name);
    }

    @Override
    public String getDiscloseData(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}
