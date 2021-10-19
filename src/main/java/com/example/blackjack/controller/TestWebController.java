package com.example.blackjack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TestWebController {
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
//    public String SayHello() {
//        return "Hello, Spring Boot!";
//    }


    /**
     * 跳转到web页面
     *
     * @return
     */
    @RequestMapping (value = {"/test"})
    public String testPage(Map<String, Object> map){
        map.put("data","100");
        //跳转到test.html
        return "test";
    }

}
