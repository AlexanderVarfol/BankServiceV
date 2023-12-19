package com.bankservice.app.service;

import com.bankservice.app.dto.TransactionDTO;
import com.bankservice.app.entity.Transaction;

public interface TransactionService {
    Transaction getTransactionById(String id);
    TransactionDTO getTransactionDto(String id);
}
