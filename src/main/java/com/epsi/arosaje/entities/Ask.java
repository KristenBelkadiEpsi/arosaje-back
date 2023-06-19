package com.epsi.arosaje.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","owner","careTaker"})
public class Ask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate endDate;
    private LocalDate beginDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @ManyToOne
    @JoinColumn(name = "caretaker_id")
    private User careTaker;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ask")
    private List<Image> images;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ask")
    private List<Commentary> commentaries;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;

    public Ask() {}
    // getters and setters
}
