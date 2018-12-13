package com.azl.controller;

import com.azl.pojo.Menu;
import com.azl.service.menu.MenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    private static Logger log = LogManager.getLogger(HomeController.class.getName());
    @Autowired
    private MenuService menuService;
    @RequestMapping("tohome")
    public String home(Model model){
        log.info("查询菜单栏");
        List<Menu> parentMenu = menuService.findParent();
        List<Menu> childMenu = menuService.findChild();
        model.addAttribute("parentMenus",parentMenu);
        model.addAttribute("childMenus",childMenu);
        return "index";
    }
}
