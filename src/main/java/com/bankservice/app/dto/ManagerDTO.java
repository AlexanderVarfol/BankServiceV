package com.bankservice.app.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
public class ManagerDTO implements Serializable {
    private String firstName;
    private String lastName;
    private String status;

}
