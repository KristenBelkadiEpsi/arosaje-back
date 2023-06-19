package com.epsi.arosaje.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;
import java.util.List;

@Entity
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","asks"})
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITYz)
    private Long id;
    @Column(length = 500, nullable = false)
    private String name;
    @Column(length = 500, nullable = false)
    private String latinName;
    @Column(length = 5000, nullable = false)
    private String description;
    @Column(nullable = false)
    private String species;
    @Column(nullable = false)
    private Integer wateringFrequency;
    @Column(nullable = false)
    private Integer sunExposure ;
    @Lob
    @Column(nullable = true)
    private Blob image;

    @ManyToOne
    @JoinColumn(name = "botanist_id")
    private Botanist botanist;

    //ask jointure
    @OneToMany(mappedBy="plant")
    private List<Ask> asks;


    public Plant() {}
}
