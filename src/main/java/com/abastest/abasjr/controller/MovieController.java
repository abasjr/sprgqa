package com.abastest.abasjr.controller;

import java.util.List;
import java.util.Optional;

import com.abastest.abasjr.model.MovieModel;
import com.abastest.abasjr.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MovieController {

    @Autowired // dengan ini kita memberitahu si spring kalau kita membutuhkan depedency injection
    // yaitu digunakan untuk menginjeksi bean dengan tipe Movie service
    private MovieService movieService;

    @RequestMapping(value="/movie/add", method = RequestMethod.GET) // harusnya menambah data menggunakan POST
    public String add(@RequestParam(value = "id", required = true) String id, 
                      @RequestParam(value = "title", required = true) String title,
                      @RequestParam(value = "genre", required = true) String genre,
                      @RequestParam(value = "budget", required = true) Long budget,
                      @RequestParam(value = "duration", required = true) int duration) {
        
        MovieModel movie = new MovieModel(id, title, genre, budget, duration);
        movieService.addMovie(movie);
        return "add";
    }

    // Tahap 2
    @RequestMapping("/movie/view") // ketika ditambah RequestMethod.GET maka html thymeleaf akan error
    public String view(@RequestParam ("id") String id, Model model) {
        MovieModel lihatMovie = movieService.getMovieDetail(id);
        model.addAttribute("movie", lihatMovie);
        return "view_movie";
    }
    
    @RequestMapping(value="/movie/viewall", method=RequestMethod.GET)
    public String viewAll(Model model) {
        List<MovieModel> lihatAllMovie = movieService.getMovieList();
        model.addAttribute("movie", lihatAllMovie);
        return "viewall_movie";
    }
    
    //Latihan 1
    @RequestMapping(value="/movie/view/{id}", method=RequestMethod.GET)
    // Using an Optional Parameter Type
    public String viewById(@PathVariable Optional<String> id, Model model) {
        if (id.isPresent()) {
            MovieModel cekMovie = movieService.getMovieDetail(id.get());
            if (cekMovie != null) {
                model.addAttribute("movie", cekMovie);
                return "view_movie";
            }
        }
        model.addAttribute("movie", id.get());
        return "error";
    }
    
    
}