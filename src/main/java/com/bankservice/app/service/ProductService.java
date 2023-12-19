package com.bankservice.app.service;

import com.bankservice.app.controller.ProductController;
import com.bankservice.app.dto.ProductDTO;
import com.bankservice.app.entity.Product;

public interface ProductService {
    Product getProductById(String id);
    ProductDTO getProductDto(String id);
}
