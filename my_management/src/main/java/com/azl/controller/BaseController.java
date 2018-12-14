package com.azl.controller;

import com.azl.pojo.Manager;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

public abstract class BaseController {
    /**
     * 获取shiro 的session
     *
     * @return
     */
    protected Session getSession() {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        return session;
    }

    /**
     * 获取当前用户信息
     *
     * @return
     */
    protected Manager getPmsOperator() {
        Manager manager = (Manager) this.getSession().getAttribute("currentUser");
        return manager;
    }
}
