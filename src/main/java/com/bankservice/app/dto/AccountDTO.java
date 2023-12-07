package com.bankservice.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountDTO {

    private String name;
    private String type;
    private String status;
    private String balance;
    private String currency;

}
