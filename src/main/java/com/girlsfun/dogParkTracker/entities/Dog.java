package com.girlsfun.dogParkTracker.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.InputStream;
import java.sql.Blob;

@Entity
@Data
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateInitializer","handler"})
public class Dog {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    private int id;
    @Column
    private String dogName;
    @Column
    private String breed;
    @Column
    private String age;
    @Column
    private String sex;
    @Column
    private String color;
    @Column
    private String aboutMyDog;
    @Column
    private int ownerId;
    @Column
    private boolean active = true;
    @Lob
    @Column(length=100000)
    private byte[] image;
    //private String image;

    public Dog(String dogName, String breed, String age, String sex, String color, String aboutMyDog, int ownerId, boolean active, byte[] image) {
        this.dogName = dogName;
        this.breed = breed;
        this.age = age;
        this.sex = sex;
        this.color = color;
        this.aboutMyDog = aboutMyDog;
        this.ownerId = ownerId;
        this.active = active;
        this.image = image;
    }

    /*@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    private Date editDate;*/

    public Dog(){
        dogName = "Rosie";
        breed = "mix";
        age = "2 years";
        sex = "female";
        color = "fawn";
        aboutMyDog = "Energetic,loves to wrestle play";
        image = null;
    }

}
