package com.devops.product_service_api_2.dto.response.paginate;

import com.devops.product_service_api_2.dto.response.ResponseProductDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseProductPaginatedDto {
    private long count;
    private List<ResponseProductDto> dataList;
}
