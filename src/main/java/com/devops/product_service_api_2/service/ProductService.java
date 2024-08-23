package com.devops.product_service_api_2.service;

import com.devops.product_service_api_2.dto.request.RequestProductDto;
import com.devops.product_service_api_2.dto.response.ResponseProductDto;
import com.devops.product_service_api_2.dto.response.paginate.ResponseProductPaginatedDto;
import org.springframework.web.multipart.MultipartFile;

import java.sql.SQLException;

public interface ProductService {
    public void create(RequestProductDto dto, MultipartFile file) throws SQLException;
    public void delete(String id);
    public void update(RequestProductDto dto, String id);
    public ResponseProductDto findById(String id);
    public ResponseProductPaginatedDto findAll(String searchText, int page, int size);
}
