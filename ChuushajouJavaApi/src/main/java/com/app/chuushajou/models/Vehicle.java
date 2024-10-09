package com.app.chuushajou.models;

import jakarta.persistence.*;


@Entity
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "license_plate")
    private String license;

    @Column(name = "color")
    private String color;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private VehicleType type;

    // Getters and setters
}