package com.example.lab6.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "artistas")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistaId")
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = true)
    private String genero;

    @Column(nullable = true, length = 9)
    private String telefono;

    @ManyToMany(mappedBy = "artistas")
    private List<Evento> eventos;
}
