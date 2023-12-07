package com.bankservice.app.mapper;

import com.bankservice.app.dto.ManagerDTO;
import com.bankservice.app.entity.Manager;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ManagerMapper {
    ManagerDTO toDto(Manager manager);
}
