package com.bankservice.app.service.impl;

import com.bankservice.app.dto.ProductDTO;
import com.bankservice.app.entity.Product;
import com.bankservice.app.mapper.ProductMapper;
import com.bankservice.app.repository.ProductRepository;
import com.bankservice.app.service.ProductService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(UUID.fromString(id))
                .orElseThrow(() -> new EntityNotFoundException("Product not found"));
    }

    @Override
    public ProductDTO getProductDto(String id) {
        return productMapper.toDto(getProductById(id));
    }
}
