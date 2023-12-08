package com.bankservice.app.service.impl;

import com.bankservice.app.entity.Transaction;
import com.bankservice.app.repository.TransactionRepository;
import com.bankservice.app.service.TransactionService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Override
    public Transaction getTransactionById(String id) {
        return transactionRepository.findById(UUID.fromString(id))
                .orElseThrow(() -> new EntityNotFoundException("Manager not found"));
    }
}
