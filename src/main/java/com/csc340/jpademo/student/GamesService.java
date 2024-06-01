package com.csc340.jpademo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamesService {

    @Autowired
    GamesRepository gamesRepository;

    public Object getAllGames() {
        return gamesRepository.findAll();
    }

}