package com.spring.boot.restAPI.SpringBootRestAPI.MovieRecommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//This annotation tell about the classes type
@RestController
public class RecommendationsController {
    @GetMapping("/movies")
    public List<Movie> getAllMovies()
    {
        return Arrays.asList(new Movie(1,"Harry Potter",9.9),
                new Movie(2,"avenger",9.5),
                new Movie(3,"Mission Impossible",9.3),
        new Movie(4,"LP",9.1));

    }

}
