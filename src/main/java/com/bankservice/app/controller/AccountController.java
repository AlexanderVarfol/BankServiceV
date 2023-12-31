package com.bankservice.app.controller;


import com.bankservice.app.dto.AccountDTO;
import com.bankservice.app.entity.Account;
import com.bankservice.app.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account/")
@RequiredArgsConstructor

public class AccountController {

    public final AccountService accountService;

    @GetMapping(value = "/{id}")
    public Account getAccountById(@PathVariable("id") String id){
        return accountService.getAccountById(id);
    }

    @GetMapping(value = "/Dto/{id}")
    public AccountDTO getAccountDto(@PathVariable("id") String id){
        return accountService.getAccountDto(id);
    }
}
