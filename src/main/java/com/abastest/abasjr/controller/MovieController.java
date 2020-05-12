package com.abastest.abasjr.controller;

import com.abastest.abasjr.model.MovieModel;
import com.abastest.abasjr.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MovieController {

    @Autowired // dengan ini kita memberitahu si spring kalau kita membutuhkan depedency injection
    // yaitu digunakan untuk menginjeksi bean dengan tipe Movie service
    private MovieService movieService;

    @RequestMapping("/movie/add")
    public String add(@RequestParam(value = "id", required = true) String id, 
                      @RequestParam(value = "title", required = true) String title,
                      @RequestParam(value = "genre", required = true) String genre,
                      @RequestParam(value = "budget", required = true) Long budget,
                      @RequestParam(value = "duration", required = true) int duration) {
        
        MovieModel movie = new MovieModel(id, title, genre, budget, duration);
        movieService.addMovie(movie);
        return "add";
    }
    
}