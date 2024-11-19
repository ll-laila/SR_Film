package com.example.sr_film.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FilmDto {

    private Long id;
    private String titre;
    private String description;
    private String genre;
    private String imageUrl;
    private String videoUrl;
    private Long createdById;
    private String createdAt;

}
