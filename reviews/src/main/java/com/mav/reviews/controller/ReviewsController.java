package com.mav.reviews.controller;

import com.mav.reviews.dto.Reviews;
import com.mav.reviews.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ReviewsController {

    @Autowired
    ReviewsService reviewsService;

    @GetMapping("reviews/{version}")
    public Reviews getReviews(@PathVariable String version){
        return reviewsService.getReviews(version);

    }


}
