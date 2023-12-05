package com.bankservice.app.service.impl;

import com.bankservice.app.entity.Account;
import com.bankservice.app.repository.AccountRepository;
import com.bankservice.app.service.util.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account getAccountById(String id) {
        return accountRepository.getById(UUID.fromString(id));
    }
}
