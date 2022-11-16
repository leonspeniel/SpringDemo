package com.leons.springdemo.service;

import com.leons.springdemo.model.Game;
import com.leons.springdemo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getGames(){

        return gameRepository.findAll();

    }

    public void addNewGame(Game game){
        gameRepository.save(game);
    }

    public void deleteGame(Long gameId) {
        if(gameRepository.existsById(gameId))
            gameRepository.deleteById(gameId);
    }

    @Transactional
    public void updateGame(Long gameId, Integer price){
        Game game = gameRepository.findById(gameId)
                .orElseThrow();

        if(price!=null && price>0 && !Objects.equals(game.getPrice(),price))
                game.setPrice(price);
    }
}
