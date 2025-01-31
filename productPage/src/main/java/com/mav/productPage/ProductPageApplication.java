package com.mav.productPage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductPageApplication.class, args);
    }

}
