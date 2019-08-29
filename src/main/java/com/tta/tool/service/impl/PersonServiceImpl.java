package com.tta.tool.service.impl;

import com.tta.tool.mapper.person.PersonMapper;
import com.tta.tool.model.Person;
import com.tta.tool.service.PersonServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 处理人员的业务逻辑类
 * Created by ts0002 on 2019/8/27.
 */
@Service
public class PersonServiceImpl implements PersonServiceI {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public int savePerson(Person person) {

        return personMapper.savePerson(person);
    }
}
