package com.azl.service.manager;

import com.azl.pojo.Manager;

public interface ManagerService {
    public Manager getByUsername(String username);
}
