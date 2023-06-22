package com.epsi.arosaje.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import java.util.Set;


@Entity
public class User {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Integer userId;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String email;

    @Column(length = 100)
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Botanist> userBotanistsses;

    @OneToMany(mappedBy = "user")
    private Set<Plant> userPlantsses;

    @OneToMany(mappedBy = "user")
    private Set<Guard> userGuardsses;

    @OneToMany(mappedBy = "sender")
    private Set<Message> senderMessagesses;

    @OneToMany(mappedBy = "receiver")
    private Set<Message> receiverMessagesses;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(final Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Set<Botanist> getUserBotanistss() {
        return userBotanistsses;
    }

    public void setUserBotanistss(final Set<Botanist> userBotanistsses) {
        this.userBotanistsses = userBotanistsses;
    }

    public Set<Plant> getUserPlantss() {
        return userPlantsses;
    }

    public void setUserPlantss(final Set<Plant> userPlantsses) {
        this.userPlantsses = userPlantsses;
    }

    public Set<Guard> getUserGuardss() {
        return userGuardsses;
    }

    public void setUserGuardss(final Set<Guard> userGuardsses) {
        this.userGuardsses = userGuardsses;
    }

    public Set<Message> getSenderMessagess() {
        return senderMessagesses;
    }

    public void setSenderMessagess(final Set<Message> senderMessagesses) {
        this.senderMessagesses = senderMessagesses;
    }

    public Set<Message> getReceiverMessagess() {
        return receiverMessagesses;
    }

    public void setReceiverMessagess(final Set<Message> receiverMessagesses) {
        this.receiverMessagesses = receiverMessagesses;
    }

}
