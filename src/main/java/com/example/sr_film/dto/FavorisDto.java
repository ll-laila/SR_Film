package com.example.sr_film.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class FavorisDto {

    private Long id;
    private Long userId;
    private Long filmId;
    private LocalDateTime dateAdded;
}
