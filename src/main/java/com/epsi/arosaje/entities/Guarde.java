package com.epsi.arosaje.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Guarde")
public class Guarde {

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
    private Long id;

    @Column
    private LocalDate debutDate;

    @Column
    private LocalDate finDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plante_id")
    private Plante plante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public LocalDate getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(final LocalDate debutDate) {
        this.debutDate = debutDate;
    }

    public LocalDate getFinDate() {
        return finDate;
    }

    public void setFinDate(final LocalDate finDate) {
        this.finDate = finDate;
    }

    public Plante getPlante() {
        return plante;
    }

    public void setPlante(final Plante plante) {
        this.plante = plante;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(final Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

}
