package com.mav.reviews.service.client;

import com.mav.reviews.dto.Ratings;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ratings")
public interface RatingsFeignClient {

    @GetMapping("ratings")
    public Ratings getRatings();

}
