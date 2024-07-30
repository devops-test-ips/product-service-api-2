package com.devops.product_service_api_2.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseProductDto {
    private String id;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
}
