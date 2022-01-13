package com.girlsfun.dogParkTracker.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class DogPark {
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    private int id;
    @Column
    private String parkName;
    @Column
    private String address;
    @Column
    private Double latitude;
    @Column
    private Double longitude;
    @Column
    private boolean active = true;

    public DogPark(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
}
