package com.example.demo.Repositories;

import com.example.demo.Models.MovieDirector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDirectorRepository extends JpaRepository<MovieDirector, Integer>
{
    public MovieDirector findByName(String name);
}
