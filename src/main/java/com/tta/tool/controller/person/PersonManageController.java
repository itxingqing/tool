package com.tta.tool.controller.person;

import com.tta.tool.model.Person;
import com.tta.tool.service.PersonServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 人员管理的控制类
 * Created by ts0002 on 2019/8/27.
 */
@Controller
@PropertySource({"classpath:static/properties/personbaseinfo.properties"})
@RequestMapping("/fillin")
public class PersonManageController {

    private Map<String, String> result = new HashMap<>();

    @Autowired
    private PersonServiceI personService;
    @Value("${upload.url}")
    private String uploadUrl;
    /**
     * 跳转用户添加信息的页面
     * 注意跳转时候，一定要加上ModelMap
     * @return modelMap
     */
    @GetMapping("/info")
    public String fillInformation(ModelMap modelMap) {
        System.out.println(">>>" +uploadUrl);
        return "person/addInfo";
    }

    /**
     * 保存用户提交的信息
     * @return
     */
    @PostMapping("/save")
    @ResponseBody
    public Object savePersonInfo(@RequestBody Person person) {
        int personId = personService.savePerson(person);
        if(personId > 0) {
            result.put("result", "提交成功！");
        }else {
            result.put("result", "提交失败！");
        }

        return result;
    }

}
