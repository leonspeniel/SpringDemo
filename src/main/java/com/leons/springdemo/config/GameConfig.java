package com.leons.springdemo.config;

import com.leons.springdemo.model.Game;
import com.leons.springdemo.repository.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class GameConfig {

    @Bean
    CommandLineRunner commandLineRunner(GameRepository gameRepository){
        return args -> {
            List<Game> gameList = new ArrayList<Game>();
            gameList.add(new Game(
                    "God of War",
                    LocalDate.of(2018,4,20),999));
            gameList.add(new Game(
                    "Horizon: Zero Dawn",
                    LocalDate.of(2017,2,28),999));
            gameList.add(new Game(
                    "God of War : Ragnarok",
                    LocalDate.of(2022,11,9),4999));
            gameList.add(new Game(
                    "Horizon: Forbidden West",
                    LocalDate.of(2022,2,18),3999));

            gameRepository.saveAll(gameList);
        };
    }
}
