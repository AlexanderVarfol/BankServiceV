package com.bankservice.app.service.util;
import com.bankservice.app.entity.Account;
import com.bankservice.app.entity.Agreement;

import java.util.Optional;

public interface AgreementService {

    Agreement getAgreementById(String id);
}