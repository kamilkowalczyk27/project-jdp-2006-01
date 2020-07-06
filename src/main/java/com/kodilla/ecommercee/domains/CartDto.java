package com.kodilla.ecommercee.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {
    private Long id;
    private List<ProductDto> products;
}
