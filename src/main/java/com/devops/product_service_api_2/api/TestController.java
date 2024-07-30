package com.devops.product_service_api_2.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-service/api/v1/tests")
public class TestController {

    @GetMapping
    public String test(){
        return "Product Service Running on port (8002)";
    }
}
