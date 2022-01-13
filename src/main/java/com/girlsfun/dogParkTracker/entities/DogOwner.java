package com.girlsfun.dogParkTracker.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class DogOwner {
    @Column
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    private int id;
    @Column
    private String ownerName;
    @Column
    private boolean tracked;
    @Column
    private boolean active = true;

    public DogOwner(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

}
