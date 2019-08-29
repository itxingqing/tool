package com.tta.tool.service;

import com.tta.tool.model.Person;
import org.springframework.stereotype.Service;

/**
 * Created by ts0002 on 2019/8/27.
 */
public interface PersonServiceI {
    public int savePerson(Person person);
}
