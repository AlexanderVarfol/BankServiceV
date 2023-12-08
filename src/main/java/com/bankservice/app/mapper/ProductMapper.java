package com.bankservice.app.mapper;

import com.bankservice.app.dto.ProductDTO;
import com.bankservice.app.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDTO toDto(Product product);

}
