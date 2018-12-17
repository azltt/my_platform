package com.azl.controller;

import com.azl.pojo.Manager;
import com.azl.pojo.Menu;
import com.azl.service.menu.MenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController extends BaseController {
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

    @RequestMapping("/toregister")
    public String toRegister(HttpServletRequest req, Model model) {
        return "system/register";
    }

    /**
     * 函数功能说明 ： 登陆后台管理系统. 修改者名字： 修改日期： 修改内容：
     *
     * @参数： @param request
     * @参数： @param model
     * @参数： @return
     * @return String
     * @throws
     */
    @RequestMapping("/tologin")
    public String index(HttpServletRequest req, Model model) {
        log.info("url:::::::::::/");
        Manager pmsOperator = (Manager) this.getSession().getAttribute("currentUser");

        if(pmsOperator==null){
            log.info("无人登录");
            return "system/login";
        }else{
            log.info(pmsOperator.toString());
            return "redirect:/tohome";
        }
       /* try {
            String tree = this.buildOperatorPermissionMenu(pmsOperator);
            model.addAttribute("tree", tree);
        } catch (Exception e) {
            log.error("登录异常:" + e.getMessage());
            model.addAttribute("message", e.getMessage());
            return "system/login";
        }
        return "index";*/

    }
}
