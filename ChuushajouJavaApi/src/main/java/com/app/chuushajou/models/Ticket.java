package com.app.chuushajou.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="vehicle_id")
    private Vehicle vehicle;

    @Column(name = "time_in")
    private LocalDateTime in_time;

    @Column(name = "time_out" )
    private LocalDateTime out_time;

    @Column(name = "total")
    private Integer total;






}
