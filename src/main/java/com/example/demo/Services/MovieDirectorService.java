package com.example.demo.Services;

import com.example.demo.Models.MovieDirector;
import com.example.demo.Repositories.MovieDirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieDirectorService
{
    @Autowired
    MovieDirectorRepository movieDirectorRepository;
    MovieDirector movieDirector;

    public String addMovieDirector(MovieDirector movieDirector)
    {
        movieDirectorRepository.save(movieDirector);
        return "movie added successfully";
    }

    public String findDirectorName(String name)
    {
        MovieDirector movieDirector = movieDirectorRepository.findByName(name);
        return movieDirector.getDirectorname();
    }
}
