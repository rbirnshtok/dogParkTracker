package com.girlsfun.dogParkTracker.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class DogOwnerParkMap {
    @Column
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    private int id;
    @Column
    private int dogOwnerId;
    @Column
    private int dogParkId;
    @Column
    private boolean active = true;

    public DogOwnerParkMap(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
}
