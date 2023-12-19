package com.bankservice.app.controller;

import com.bankservice.app.dto.ManagerDTO;
import com.bankservice.app.dto.ProductDTO;
import com.bankservice.app.entity.Account;
import com.bankservice.app.entity.Product;
import com.bankservice.app.service.AccountService;
import com.bankservice.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {


    public final ProductService productService;

    @GetMapping(value = "/{id}")
    public Product getProductById(@PathVariable("id") String id){
        return productService.getProductById(id);
    }

    @GetMapping(value = "/Dto/{id}")
    public ProductDTO getProductDto(@PathVariable("id") String id){
        return productService.getProductDto(id);
    }
}
