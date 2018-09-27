package com.jong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {
    private String promotion;
    private String promotionPrice;
    private String productPrice;
}
