package com.bankservice.app.controller;


import com.bankservice.app.entity.Client;
import com.bankservice.app.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping(value = "/{id}")
    public Client getClientById(@PathVariable("id") String id){
        return clientService.getClientById(id);
    }

}
