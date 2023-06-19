package com.epsi.arosaje.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("B")
public class Botanist extends User {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "botanist")
    private List<Plant> plants;

    public Botanist() {}
}
