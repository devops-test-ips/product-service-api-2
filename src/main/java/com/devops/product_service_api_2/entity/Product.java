package com.devops.product_service_api_2.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "products")
@Builder
// [relation database->(table,Data raw)] [non-relational database->(collection, document)]
public class Product {
    @Id
    private String id;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
    private FileData data;
}
