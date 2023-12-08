package com.bankservice.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AgreementDTO {

    private String interestRate;
    private String status;
    private String sum;

}
