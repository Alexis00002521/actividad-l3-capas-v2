package com.ncapas.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "videogames")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoGame {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID )
    private UUID id;

    @Column
    private String name;
    @Column
    private String genre;
    @Column
    private Integer releaseYear;
    @Column
    private String developer;
}
