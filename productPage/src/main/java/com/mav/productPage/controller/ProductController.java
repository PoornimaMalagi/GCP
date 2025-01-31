package com.mav.productPage.controller;

import com.mav.productPage.dto.Product;
import com.mav.productPage.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("productPage")
    public Product getProductDetails() {
        return productService.getProductDetails();
    }
}
