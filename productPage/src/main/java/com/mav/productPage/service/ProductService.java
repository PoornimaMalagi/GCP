package com.mav.productPage.service;

import com.mav.productPage.dto.Details;
import com.mav.productPage.dto.Product;
import com.mav.productPage.dto.Reviews;
import com.mav.productPage.service.client.DetailsFeignClient;
import com.mav.productPage.service.client.ReviewFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    DetailsFeignClient dfc;

    @Autowired
    ReviewFeignClient rfc;

    public Product getProductDetails() {
        Product product = new Product();
        product.setBooks("The Great Gatsby");
        Details details = dfc.getDetails();
        Reviews reviews = rfc.getReviews("v3");
        product.setDetails(details);
        product.setReviews(reviews);


        return product;
    }
}


