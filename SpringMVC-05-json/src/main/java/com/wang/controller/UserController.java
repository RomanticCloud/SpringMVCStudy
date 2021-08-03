package com.wang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController只会返回字符串；
@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody//它不会走视图解析器，而会直接返回一个字符串；
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        User user = new User("王",21,"男");
        String str = mapper.writeValueAsString(user);

        return str;
    }
}
