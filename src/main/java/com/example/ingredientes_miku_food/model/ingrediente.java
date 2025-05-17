package com.example.ingredientes_miku_food.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Ingrediente")
@Entity
public class ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 20)
    private String nombre;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false)
    private Double costoXunidad;


}
