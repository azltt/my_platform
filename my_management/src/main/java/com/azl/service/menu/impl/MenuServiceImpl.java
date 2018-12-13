package com.azl.service.menu.impl;

import com.azl.mapper.MenuDao;
import com.azl.pojo.Menu;
import com.azl.pojo.MenuExample;
import com.azl.service.menu.MenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    private static Logger log = LogManager.getLogger(MenuServiceImpl.class.getName());
    @Autowired
    private MenuDao menuDao;
    @Override
    public  List<Menu> findParent() {
        log.info("查询所有主菜单");
        MenuExample menuExample=new MenuExample();
        MenuExample.Criteria criteria=menuExample.createCriteria();
        criteria.andParentIdIsNull();
        List<Menu> menus = menuDao.selectByExample(menuExample);
        return menus;
    }

    @Override
    public List<Menu> findChild() {
        log.info("查询所有子菜单");
        MenuExample menuExample=new MenuExample();
        MenuExample.Criteria criteria=menuExample.createCriteria();
        criteria.andParentIdIsNotNull();
        List<Menu> menus = menuDao.selectByExample(menuExample);
        return menus;
    }
}
