package com.challenge.zendeskbackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
}
