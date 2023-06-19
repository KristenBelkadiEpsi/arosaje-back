package com.epsi.arosaje.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","ask"})
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 250, nullable = false)
    private String city;

    @Column(length = 50, nullable = false)
    private String country;

    @Column(length = 200, nullable = false)
    private String street;

    @Column(length = 20, nullable = false)
    private Integer zipCode;
    @Column
    private Double latitude;
    @Column
    private Double longitude;

    @OneToOne(mappedBy = "location")
    private Ask ask;

    public Location(){}

    public Location( String country, String city, String street, Integer zipCode, Double longitude, Double latitude ) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.longitude = longitude;
        this.latitude = latitude;
    }


}
