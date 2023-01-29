package com.example.demo.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data

public class MovieDirector
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Moviename;
    private String Directorname;

}
