package com.azl.service.manager.impl;

import com.azl.mapper.ManagerDao;
import com.azl.pojo.Manager;
import com.azl.pojo.ManagerExample;
import com.azl.service.manager.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerDao managerDao;
    @Override
    public Manager getByUsername(String username) {
        ManagerExample example=new ManagerExample();
        ManagerExample.Criteria criteria = example.createCriteria();
        criteria.andManagerNameEqualTo(username);
        List<Manager> managers = managerDao.selectByExample(example);
        if(managers.size()>0){
            return managers.get(0);
        }else{
            return null;
        }


    }
}
