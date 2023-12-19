package com.bankservice.app.service.impl;

import com.bankservice.app.dto.AccountDTO;
import com.bankservice.app.entity.Account;
import com.bankservice.app.mapper.AccountMapper;
import com.bankservice.app.repository.AccountRepository;
import com.bankservice.app.service.AccountService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public Account getAccountById(String id) {
        return accountRepository.findById(UUID.fromString(id))
                .orElseThrow(()-> new EntityNotFoundException("Not Found"));
    }

    @Override
    public AccountDTO getAccountDto(String id) {
        System.out.println(id);
        System.out.println(UUID.fromString(id));
        System.out.println(accountRepository.existsById(UUID.fromString(id)));
        Account notFound1 = accountRepository.findById(UUID.fromString(id))
                .orElseThrow(() -> new EntityNotFoundException("Not Found"));
        System.out.println(notFound1);
        AccountDTO notFound = accountMapper.toDto(notFound1);
        System.out.println(notFound);
        return notFound;
    }

}
