package com.epsi.arosaje.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import java.util.Set;


@Entity
public class Plants {

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
    private Integer plantId;

    @Column(length = 100)
    private String name;

    @Column
    private String description;

    @Column
    private String photo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    @OneToMany(mappedBy = "plant")
    private Set<Guards> plantGuardss;

    @OneToMany(mappedBy = "plant")
    private Set<Tips> plantTipss;

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(final Integer plantId) {
        this.plantId = plantId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(final String photo) {
        this.photo = photo;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(final Users user) {
        this.user = user;
    }

    public Set<Guards> getPlantGuardss() {
        return plantGuardss;
    }

    public void setPlantGuardss(final Set<Guards> plantGuardss) {
        this.plantGuardss = plantGuardss;
    }

    public Set<Tips> getPlantTipss() {
        return plantTipss;
    }

    public void setPlantTipss(final Set<Tips> plantTipss) {
        this.plantTipss = plantTipss;
    }

}
