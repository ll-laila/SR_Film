package com.example.sr_film.service;

import com.example.sr_film.repository.IndexationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexationService {

    @Autowired
    private IndexationRepository indexationRepository ;

}
