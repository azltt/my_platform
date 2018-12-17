package com.azl.controller;

import com.azl.pojo.Manager;
import com.azl.service.manager.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("management")
public class RegisterController {
    @Autowired
    private ManagerService managerService;
    @RequestMapping("doregister")
    public String register(Manager manager, Model model){

        if(managerService.register(manager)){
            model.addAttribute("register_msg","注册成功");
        }else{
            model.addAttribute("register_msg","注册失败");
        }
        return "system/register";
    }
}
