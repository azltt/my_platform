package com.azl.service.menu;

import com.azl.pojo.Menu;

import java.util.List;

public interface MenuService {

    public List<Menu> findParent();

    public List<Menu> findChild();
}
