package com.bankservice.app.service;
import com.bankservice.app.dto.AgreementDTO;
import com.bankservice.app.entity.Account;
import com.bankservice.app.entity.Agreement;

import java.util.Optional;

public interface AgreementService {

    Agreement getAgreementById(String id);

    AgreementDTO getAgreementDto(String id);
}