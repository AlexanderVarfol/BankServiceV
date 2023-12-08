package com.bankservice.app.mapper;

import com.bankservice.app.dto.TransactionDTO;
import com.bankservice.app.entity.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface TransactionMapper {

    TransactionDTO toDto(Transaction transaction);

}
