package com.mav.productPage.service.client;

import com.mav.productPage.dto.Reviews;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("reviews")
public interface ReviewFeignClient {

    @GetMapping("reviews/{version}")
    public Reviews getReviews(@PathVariable String version);
}
