package com.bankservice.app.service.impl;


import com.bankservice.app.dto.ManagerDTO;
import com.bankservice.app.entity.Manager;
import com.bankservice.app.mapper.ManagerMapper;
import com.bankservice.app.repository.ManagerRepository;
import com.bankservice.app.service.ManagerService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ManagerServiceImpl implements ManagerService {

    private final ManagerRepository managerRepository;
    private final ManagerMapper managerMapper;

    @Override
    public Manager getManagerById(UUID id) {
        return managerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Manager not found"));
    }

    @Override
    public ManagerDTO getManagerDto(UUID id) {
        return managerMapper.toDto(getManagerById(id));
    }
}
