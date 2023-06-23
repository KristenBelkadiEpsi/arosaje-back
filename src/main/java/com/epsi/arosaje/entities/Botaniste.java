package com.epsi.arosaje.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Botaniste")
public class Botaniste {

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
    private Integer botanisteId;

    @Column
    private Integer utilisateurId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisteur_id")
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "botaniste")
    private Set<Conseil> botanisteConseils;

    public Integer getBotanisteId() {
        return botanisteId;
    }

    public void setBotanisteId(final Integer botanisteId) {
        this.botanisteId = botanisteId;
    }

    public Integer getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(final Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
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
