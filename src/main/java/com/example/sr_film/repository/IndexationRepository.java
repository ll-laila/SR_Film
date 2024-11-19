package com.example.sr_film.repository;

import com.example.sr_film.entity.Indexation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexationRepository extends JpaRepository<Indexation, Long> {

}
