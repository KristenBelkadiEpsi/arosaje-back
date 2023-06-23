package com.epsi.arosaje.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Plante")
public class Plante {

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
    private Integer planteId;

    @Column(length = 100)
    private String nom;

    @Column(columnDefinition = "text")
    private String description;

    @Column(columnDefinition = "text")
    private String photo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "plante")
    private Set<Guarde> planteGuardes;

    @OneToMany(mappedBy = "plante")
    private Set<Conseil> planteConseils;

    public Integer getPlanteId() {
        return planteId;
    }

    public void setPlanteId(final Integer planteId) {
        this.planteId = planteId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
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

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(final Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Set<Guarde> getPlanteGuardes() {
        return planteGuardes;
    }

    public void setPlanteGuardes(final Set<Guarde> planteGuardes) {
        this.planteGuardes = planteGuardes;
    }

    public Set<Conseil> getPlanteConseils() {
        return planteConseils;
    }

    public void setPlanteConseils(final Set<Conseil> planteConseils) {
        this.planteConseils = planteConseils;
    }

}
