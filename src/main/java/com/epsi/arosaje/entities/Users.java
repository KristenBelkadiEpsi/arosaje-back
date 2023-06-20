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
public class Users {

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
    private Set<Botanists> userBotanistss;

    @OneToMany(mappedBy = "user")
    private Set<Plants> userPlantss;

    @OneToMany(mappedBy = "user")
    private Set<Guards> userGuardss;

    @OneToMany(mappedBy = "sender")
    private Set<Messages> senderMessagess;

    @OneToMany(mappedBy = "receiver")
    private Set<Messages> receiverMessagess;

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

    public Set<Botanists> getUserBotanistss() {
        return userBotanistss;
    }

    public void setUserBotanistss(final Set<Botanists> userBotanistss) {
        this.userBotanistss = userBotanistss;
    }

    public Set<Plants> getUserPlantss() {
        return userPlantss;
    }

    public void setUserPlantss(final Set<Plants> userPlantss) {
        this.userPlantss = userPlantss;
    }

    public Set<Guards> getUserGuardss() {
        return userGuardss;
    }

    public void setUserGuardss(final Set<Guards> userGuardss) {
        this.userGuardss = userGuardss;
    }

    public Set<Messages> getSenderMessagess() {
        return senderMessagess;
    }

    public void setSenderMessagess(final Set<Messages> senderMessagess) {
        this.senderMessagess = senderMessagess;
    }

    public Set<Messages> getReceiverMessagess() {
        return receiverMessagess;
    }

    public void setReceiverMessagess(final Set<Messages> receiverMessagess) {
        this.receiverMessagess = receiverMessagess;
    }

}
