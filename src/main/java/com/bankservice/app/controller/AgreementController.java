package com.bankservice.app.controller;
import com.bankservice.app.dto.AgreementDTO;
import com.bankservice.app.entity.Agreement;
import com.bankservice.app.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agreement")
@RequiredArgsConstructor
public class AgreementController {

    private final AgreementService agreementService;

    @GetMapping(value = "/{id}")
    public Agreement getAgreementById(@PathVariable("id") String id){
        return agreementService.getAgreementById(id);
    }

    @GetMapping(value = "/Dto/{id}")
    public AgreementDTO getAgreementDto(@PathVariable("id") String id){
        return agreementService.getAgreementDto(id);
    }
}
