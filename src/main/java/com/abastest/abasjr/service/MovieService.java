package com.abastest.abasjr.service;

import java.util.List;

import com.abastest.abasjr.model.MovieModel;

public interface MovieService { // interface adalah class 

    void addMovie(MovieModel movie); // method add Movie

    List<MovieModel> getMovieList(); // melihat list movie

    MovieModel getMovieDetail(String id);

    
    
}