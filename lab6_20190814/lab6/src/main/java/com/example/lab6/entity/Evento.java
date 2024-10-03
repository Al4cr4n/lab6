package com.example.lab6.entity;





import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.*;

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

    @NotBlank(message = "El nombre del evento es obligatorio")
    @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
    private String nombre;

    @NotNull(message = "La fecha del evento es obligatoria")
    @Future(message = "La fecha del evento debe ser futura")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;

    @NotNull(message = "El número de asistentes esperados es obligatorio")
    @Min(value = 1, message = "El número de asistentes esperados debe ser positivo")
    private Integer asistentesEsperados;

    // Otros atributos o relaciones
}


