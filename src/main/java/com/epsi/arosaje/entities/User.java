package com.epsi.arosaje.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
@DiscriminatorValue("U")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(nullable = false)
    private String email;
    @Column(length = 500, nullable = false)
    private String password;
    @Column(nullable = true)
    private Boolean gender;
    @Column(nullable = false)
    private LocalDate registerDate;
    @Column(nullable = false)
    private LocalDate birthDate;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Ask> asks_owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "careTaker")
    private List<Ask> asks_caretaker;

    public User() {}

}