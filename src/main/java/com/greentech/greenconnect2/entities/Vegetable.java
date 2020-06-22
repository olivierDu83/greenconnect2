package com.greentech.greenconnect2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Vegetable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "LEGUME", length = 20)
    private String nameVegetable;
    @Column(name = "DESCRIPTION")
    private String libelle;
    @Column(name = "SEME")
    private Date dateSowing;
    @Column(name = "RECOLTE")
    private Date dateHarvest;
    private int zone;
}
