package com.bankservice.app.service;

import com.bankservice.app.dto.ClientDTO;
import com.bankservice.app.entity.Client;

public interface ClientService {


    Client getClientById(String id);

    ClientDTO getClientDto(String id);
}
