package com.bankservice.app.service;

import com.bankservice.app.dto.AccountDTO;
import com.bankservice.app.entity.Account;

public interface AccountService {
    Account getAccountById(String id);
    AccountDTO getAccountDto(String id);
}
