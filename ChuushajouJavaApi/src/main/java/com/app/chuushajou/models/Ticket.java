package com.app.chuushajou.models;

import jakarta.persistence.*;


public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="vehicle_id")
    private Vehicle vehicle;

    @Column(name = "total")
    private Integer total;
}
