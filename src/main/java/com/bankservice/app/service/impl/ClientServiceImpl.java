package com.bankservice.app.service.impl;

import com.bankservice.app.dto.AgreementDTO;
import com.bankservice.app.dto.ClientDTO;
import com.bankservice.app.entity.Client;
import com.bankservice.app.mapper.ClientMapper;
import com.bankservice.app.repository.ClientRepository;
import com.bankservice.app.service.ClientService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
// нужен для
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public Client getClientById(String id) {
        return clientRepository.findById(UUID.fromString(id))
                .orElseThrow(() -> new EntityNotFoundException("Client not found"));
    }
    @Override
    public ClientDTO getClientDto(String client_id) {
        return clientMapper.toDto(getClientById(client_id));
    }
}
