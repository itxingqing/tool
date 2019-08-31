package com.tta.tool.controller.hotel;

import com.tta.tool.model.JsonData;
import com.tta.tool.service.HotelServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 主要用于管理酒店泄露数据的控制类
 */
@RestController
@RequestMapping("/disclose")
public class HotelManageController {

    @Autowired
    private HotelServiceI hotelServiceI;

    /**
     * 将前端的人员信息保存到redis
     * @param idCard
     * @param personName
     * @return
     */
    @PostMapping("add")
    public Object addDiscloseInfo(String idCard, String personName) {
        hotelServiceI.addDiscloseData(idCard, personName);
        return JsonData.successDeal();
    }

    /**
     * 根据身份证信息，从redis中找到缓存数据
     * @param idCard
     * @return
     */
    @GetMapping("get")
    public Object getDiscloseInfo(String idCard) {
        String personName = hotelServiceI.getDiscloseData(idCard);
        return JsonData.successDeal(personName);
    }
}
