package com.bankservice.app.service.impl;

import com.bankservice.app.entity.Account;
import com.bankservice.app.repository.AccountRepository;
import com.bankservice.app.service.util.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.UUID;

@Service
@org.springframework.transaction.annotation.Transactional
public class AccountServiceImpl implements AccountService {

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    private final AccountRepository accountRepository;


    @Override
    @Transactional(timeout = 60,
            readOnly = true,
            isolation = Isolation.SERIALIZABLE)
    public Account getAccountById(String id) {
        return accountRepository.getById(UUID.fromString(id));
    }
}
