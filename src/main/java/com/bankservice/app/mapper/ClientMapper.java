package com.bankservice.app.mapper;

import com.bankservice.app.dto.ClientDTO;
import com.bankservice.app.entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ClientMapper {

    ClientDTO toDto(Client client);

}
