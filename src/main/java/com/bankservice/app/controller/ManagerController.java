package com.bankservice.app.controller;

import com.bankservice.app.dto.ManagerDTO;
import com.bankservice.app.entity.Client;
import com.bankservice.app.service.ClientService;
import com.bankservice.app.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/manager")
@RequiredArgsConstructor
public class ManagerController {

    private final ManagerService managerService;

    @GetMapping(value = "/{id}")
    public ManagerDTO getManagerDto(@PathVariable("id") String id){
        return managerService.getManagerDto(id);
    }

}
