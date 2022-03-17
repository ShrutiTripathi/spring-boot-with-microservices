package com.demo.moviecatalogservice.controller;

import com.demo.moviecatalogservice.model.CatalogItem;
import com.demo.moviecatalogservice.model.Movie;
import com.demo.moviecatalogservice.model.Rating;
import com.demo.moviecatalogservice.model.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private WebClient.Builder webClientBuilder;

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalogItem(@PathVariable("userId") String userId){

        UserRatings userRating = restTemplate.getForObject("http://rating-data-service/ratings/user/"+userId, UserRatings.class);
        //RestTemplate restTemplate = new RestTemplate();

        return userRating.getUserRatings().stream().map(rating ->{
            //using RestTemplate
            Movie movie = restTemplate.getForObject("http://movie-info-service/movie/"+ rating.getMovieId(), Movie.class);

            //using WebClient
          /* Movie movie= webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8081/movie/"+ rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();
*/
            return new CatalogItem(movie.getName(),"test",rating.getRatings());
        }).collect(Collectors.toList());

       /* return Collections.singletonList(
                new CatalogItem("Transformrrrr","test",4)

        );*/

    }


}
