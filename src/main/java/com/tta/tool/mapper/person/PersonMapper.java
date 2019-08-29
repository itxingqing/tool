package com.tta.tool.mapper.person;

import com.tta.tool.model.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Component;

/**
 * Created by ts0002 on 2019/8/27.
 * 注意，mapper接口是不需要加@Component注解的，可以直接使用autowireed进行注入
 */
public interface PersonMapper {

    /**
     * 保存人员信息到数据库中，进行持久化
     * @param person
     * @return
     */
    @Insert("insert into person(name, phone_number, id_card, passport) VALUES " +
                                                    "(#{name}, #{phoneNumber}, #{idCard}, #{passport})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int savePerson(Person person);

}
