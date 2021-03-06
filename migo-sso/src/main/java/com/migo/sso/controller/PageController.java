package com.migo.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author  知秋
 * Created by kauw on 2016/10/28.
 */
@Controller
public class PageController {
    /**
     * 展示登录页面，以后迭代 TODO
     */
    @RequestMapping("/page/login")
    public String showLogin(String redirectURL,Model model){
        //把参数传给jsp
        model.addAttribute("redirect",redirectURL);
        return "login";
    }
    /**
     * 展示注册页面
     * 迭代
     * TODO
     */
    @RequestMapping("/page/register")
    public String showRegister(){
        return "register";
    }
}
