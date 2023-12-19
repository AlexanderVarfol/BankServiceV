package com.bankservice.app.controller;

import com.bankservice.app.dto.TransactionDTO;
import com.bankservice.app.entity.Account;
import com.bankservice.app.entity.Transaction;
import com.bankservice.app.service.AccountService;
import com.bankservice.app.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    public final TransactionService transactionService;

    @GetMapping(value = "/{id}")
    public Transaction getTransactionById(@PathVariable("id") String id){
        return transactionService.getTransactionById(id);
    }
    @GetMapping(value = "/Dto/{id}")
    public TransactionDTO getTransactionDto(@PathVariable("id") String  id){
        return transactionService.getTransactionDto(id);
    }
}
