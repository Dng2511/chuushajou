package com.app.chuushajou.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="vehicle_id")
    private Vehicle vehicle;

    @Column(name = "total")
    private Integer total;

    @Column (name = "vehicle_type")
    private VehicleType vehicleType;


}

