package com.leons.springdemo.repository;

import com.leons.springdemo.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface GameRepository extends JpaRepository<Game,Long> {
}
