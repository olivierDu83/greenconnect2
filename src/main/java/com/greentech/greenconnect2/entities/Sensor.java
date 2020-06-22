package com.greentech.greenconnect2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Sensor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "SENSOR", length = 20)
    private String nameSensor;
    @Column(length = 3)
    private int zone;
    @Column(name = "ACTIF")
    private boolean actived;
}
