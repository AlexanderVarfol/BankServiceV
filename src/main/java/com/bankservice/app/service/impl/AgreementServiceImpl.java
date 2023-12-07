package com.bankservice.app.service.impl;
import com.bankservice.app.entity.Agreement;
import com.bankservice.app.repository.AgreementRepository;
import com.bankservice.app.service.AgreementService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AgreementServiceImpl implements AgreementService {

    private final AgreementRepository agreementRepository;

    @Override
    public Agreement getAgreementById(String id) {
        return agreementRepository.findById(UUID.fromString(id))
                .orElseThrow(() -> new EntityNotFoundException("Agreement not found"));
    }
}