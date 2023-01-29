package com.example.demo.Controllers;

import com.example.demo.Models.MovieDirector;
import com.example.demo.Services.MovieDirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController
{
    @Autowired
    MovieDirectorService movieDirectorService;

    @PostMapping("/addMovie")
    public ResponseEntity<String> addMovieDirector(@RequestBody MovieDirector movieDirector)
    {
        String s = movieDirectorService.addMovieDirector(movieDirector);
        return new ResponseEntity<>(s, HttpStatus.CREATED);
    }

    @GetMapping("/{get_director_by_name}")
    public ResponseEntity<String> getDirectorName(@PathVariable String moviename)
    {
        String directorName = movieDirectorService.findDirectorName(moviename);
        return new ResponseEntity<>(directorName, HttpStatus.ACCEPTED);
    }
}
