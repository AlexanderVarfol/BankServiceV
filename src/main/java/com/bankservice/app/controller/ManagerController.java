package com.bankservice.app.controller;

import com.bankservice.app.dto.ManagerDTO;
import com.bankservice.app.entity.Agreement;
import com.bankservice.app.entity.Client;
import com.bankservice.app.entity.Manager;
import com.bankservice.app.service.ClientService;
import com.bankservice.app.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/manager")
@RequiredArgsConstructor
public class ManagerController {

    private final ManagerService managerService;

//    @GetMapping(value = "/{id}")
//    public Manager getManagerById(@PathVariable("id") String id){
//        return managerService.getManagerById(id);
//    }
    @GetMapping("/get/{id}")
    public ManagerDTO getManagerDto(@PathVariable UUID id){
        return managerService.getManagerDto(id);
    }
}
