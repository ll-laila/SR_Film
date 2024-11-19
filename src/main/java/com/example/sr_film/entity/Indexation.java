package com.example.sr_film.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "indexation")
public class Indexation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id ;

    private String term ;

    @OneToMany(mappedBy = "film")
    private List<Film> films;
}
