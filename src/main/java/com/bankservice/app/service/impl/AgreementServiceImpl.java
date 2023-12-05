package com.bankservice.app.service.impl;
import com.bankservice.app.entity.Account;
import com.bankservice.app.entity.Agreement;
import com.bankservice.app.repository.AgreementRepository;
import com.bankservice.app.service.util.AgreementService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Optional;
import java.util.UUID;
import java.util.List;

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