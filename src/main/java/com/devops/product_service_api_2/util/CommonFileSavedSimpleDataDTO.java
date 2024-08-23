package com.devops.product_service_api_2.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonFileSavedSimpleDataDTO {
    private String hash;
    private String directory;
    private String fileName;
    private String resourceUrl;
}
