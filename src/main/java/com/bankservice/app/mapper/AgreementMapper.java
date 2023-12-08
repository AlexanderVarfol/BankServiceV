package com.bankservice.app.mapper;

import com.bankservice.app.dto.AgreementDTO;
import com.bankservice.app.entity.Agreement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgreementMapper {

    AgreementDTO toDto(Agreement agreement);

}
