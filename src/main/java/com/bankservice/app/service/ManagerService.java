package com.bankservice.app.service;

import com.bankservice.app.dto.ManagerDTO;
import com.bankservice.app.entity.Manager;

public interface ManagerService {

    Manager getManagerById(String id);

    ManagerDTO getManagerDto(String id);
}

