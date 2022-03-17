package com.demo.ratingsdataservice.controller;

import com.demo.ratingsdataservice.model.Rating;
import com.demo.ratingsdataservice.model.UserRatings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping("/{movieId}")
    public Rating getRatings(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }

    @GetMapping("user/{userId}")
    public UserRatings getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1", 4),
                new Rating("2",5)
        );
        UserRatings userRatings = new UserRatings();
        userRatings.setUserRatings(ratings);
        return userRatings;
    }
}
