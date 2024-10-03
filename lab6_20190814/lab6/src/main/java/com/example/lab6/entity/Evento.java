package com.example.lab6.entity;





import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "eventos")  // Verifica que @Table esté importado correctamente
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventoId")
    private Integer id;
    private String nombre;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;
    private Integer asistentesEsperados;

    // Otros atributos o relaciones
}


