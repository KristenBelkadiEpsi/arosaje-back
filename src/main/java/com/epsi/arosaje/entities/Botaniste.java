package com.epsi.arosaje.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Botaniste")
public class Botaniste {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer botanisteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "botaniste")
    private Set<Conseil> botanisteConseils;

    public Integer getBotanisteId() {
        return botanisteId;
    }

    public void setBotanisteId(final Integer botanisteId) {
        this.botanisteId = botanisteId;
    }


    public Utilisateur getUtilisteur() {
        return utilisateur;
    }

    public void setUtilisteur(final Utilisateur utilisteur) {
        this.utilisateur = utilisteur;
    }

    public Set<Conseil> getBotanisteConseils() {
        return botanisteConseils;
    }

    public void setBotanisteConseils(final Set<Conseil> botanisteConseils) {
        this.botanisteConseils = botanisteConseils;
    }
}
