package com.bankservice.app.controller;
import com.bankservice.app.entity.Account;
import com.bankservice.app.entity.Agreement;
import com.bankservice.app.service.util.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/agreement")
@RequiredArgsConstructor
public class AgreementController {

    private final AgreementService agreementService;

    @GetMapping(value = "/{id}")
    public Agreement getAgreementById(@PathVariable("id") String id){
        return agreementService.getAgreementById(id);
    }
}
