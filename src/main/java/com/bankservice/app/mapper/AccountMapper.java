package com.bankservice.app.mapper;

import com.bankservice.app.dto.AccountDTO;
import com.bankservice.app.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(source = "currencyCode", target = "currency")
    AccountDTO toDto(Account account);

}
