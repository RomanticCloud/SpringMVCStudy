package com.wang.controller;


import com.sun.deploy.net.HttpResponse;
import com.wang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "ajax";
    }

    @RequestMapping("/a1")
    public void a1(String username, HttpServletResponse response) throws IOException {
        if ("wang".equals(username)){
            response.getWriter().print("ture");
        }else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User("Java",1,"男"));
        userList.add(new User("前端",2,"男"));
        userList.add(new User("Ajax",3,"女"));
        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        if (name!=null){
            if ("admin".equals(name)){
                msg = "OK";
            }else {
                msg = "用户名有误";
            }
        }
        if (pwd!=null){
            if ("123456".equals(pwd)){
                msg = "OK";
            }else {
                msg = "密码有误";
            }
        }
        return msg;
    }
}
