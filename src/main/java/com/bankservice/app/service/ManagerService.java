package com.bankservice.app.service;

import com.bankservice.app.dto.ManagerDTO;
import com.bankservice.app.entity.Manager;

import java.util.UUID;

public interface ManagerService {

    Manager getManagerById(UUID id);

    ManagerDTO getManagerDto(UUID id);
}

