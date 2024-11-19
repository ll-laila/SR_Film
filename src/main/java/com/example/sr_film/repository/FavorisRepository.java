package com.example.sr_film.repository;


import com.example.sr_film.entity.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavorisRepository extends JpaRepository<Favoris, Long> {


}
