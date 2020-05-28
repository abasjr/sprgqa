package com.abastest.abasjr.service;

import java.util.ArrayList;
import java.util.List;

import com.abastest.abasjr.model.MovieModel;

import org.springframework.stereotype.Service;

@Service
public class InMemoryMovieService implements MovieService {

    private List<MovieModel> rakMovie;

    public InMemoryMovieService(){
        rakMovie = new ArrayList<>();
    }

    @Override
    public void addMovie(MovieModel movie) {
        rakMovie.add(movie);
    }

    @Override
    public List<MovieModel> getMovieList() {
        return rakMovie;
    }

    @Override
    public MovieModel getMovieDetail(String id) {
        MovieModel movie = null;
        for (MovieModel temp: rakMovie) {
            if(temp.getId().equalsIgnoreCase(id))
           movie = temp; 
        }
        return movie;
    }

    @Override
    public MovieModel deleteMovie(String id) {
        MovieModel movie = getMovieDetail(id);
        if (movie != null) {
            rakMovie.remove(movie);
        }
        return movie;
    }
    
}