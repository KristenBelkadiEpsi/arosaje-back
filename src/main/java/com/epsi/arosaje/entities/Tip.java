package com.epsi.arosaje.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import java.time.OffsetDateTime;


@Entity
public class Tip {

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
    private Integer tipId;

    @Column
    private String content;

    @Column
    private OffsetDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "botanist_id")
    private Botanist botanist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plant_id")
    private Plant plant;

    public Integer getTipId() {
        return tipId;
    }

    public void setTipId(final Integer tipId) {
        this.tipId = tipId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(final OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Botanist getBotanist() {
        return botanist;
    }

    public void setBotanist(final Botanist botanist) {
        this.botanist = botanist;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(final Plant plant) {
        this.plant = plant;
    }

}
