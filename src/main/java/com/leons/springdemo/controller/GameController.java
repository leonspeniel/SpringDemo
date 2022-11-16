package com.leons.springdemo.controller;

import com.leons.springdemo.model.Game;
import com.leons.springdemo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/games")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<Game> getGames(){
        return gameService.getGames();

    }

    @PostMapping
    public void addNewGame(@RequestBody Game game){
        gameService.addNewGame(game);
    }

    @DeleteMapping(path="{gameId}")
    public void deleteGame(@PathVariable("gameId") Long gameId){
        gameService.deleteGame(gameId);
    }

    @PutMapping(path="{gameId}")
    public void updateGame(@PathVariable("gameId") Long gameId,
                           @RequestParam(required = false) Integer price){
        gameService.updateGame(gameId,price);
    }
}
