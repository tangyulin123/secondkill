package com.example.secondkill.controller;

import com.example.secondkill.service.PurchaseService;
import com.example.secondkill.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author tangyulin
 * @description
 * @createtime 2019/2/18
 */
@RestController
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @RequestMapping("/test")
    public ModelAndView testPage(){
        ModelAndView modelAndView = new ModelAndView("test");
        return modelAndView;
    }

    @RequestMapping(value = "/purchase",method = RequestMethod.POST)
    public Result purchase(Long userId, Long productId, Integer quantity){
        boolean success = purchaseService.purchase(userId, productId, quantity);
        String result = success ? "抢购成功" : "抢购失败";
        return new Result(success,result);
    }
}
