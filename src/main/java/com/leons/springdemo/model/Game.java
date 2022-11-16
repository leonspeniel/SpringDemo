package com.leons.springdemo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Game {

    @Id
    @SequenceGenerator(
            name = "game_sequence",
            sequenceName = "game_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "game_sequence"
    )

    private Long id;
    private String name;
    private LocalDate releaseDate;
    private Integer price;

    public Game() {
    }

    public Game(String name, LocalDate releaseDate, Integer price) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public Game(Long id, String name, LocalDate releaseDate, Integer price) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", releseDate=" + releaseDate +
                ", price=" + price +
                '}';
    }
}
