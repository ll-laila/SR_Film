package com.example.sr_film.repository;

import com.example.sr_film.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

}
