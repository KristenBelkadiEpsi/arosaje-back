package com.epsi.arosaje.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

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
    private Integer utilisateurId;

    @Column(length = 100)
    private String nom;

    @Column(length = 100)
    private String email;

    @Column(length = 100)
    private String motdepasse;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Botaniste> utilisteurBotanistes;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Plante> utilisateurPlantes;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Guarde> utilisateurGuardes;

    @OneToMany(mappedBy = "expediteur")
    private Set<Message> expediteurMessages;

    @OneToMany(mappedBy = "destinataire")
    private Set<Message> destinataireMessages;

    public Integer getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(final Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(final String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public Set<Botaniste> getUtilisteurBotanistes() {
        return utilisteurBotanistes;
    }

    public void setUtilisteurBotanistes(final Set<Botaniste> utilisteurBotanistes) {
        this.utilisteurBotanistes = utilisteurBotanistes;
    }

    public Set<Plante> getUtilisateurPlantes() {
        return utilisateurPlantes;
    }

    public void setUtilisateurPlantes(final Set<Plante> utilisateurPlantes) {
        this.utilisateurPlantes = utilisateurPlantes;
    }

    public Set<Guarde> getUtilisateurGuardes() {
        return utilisateurGuardes;
    }

    public void setUtilisateurGuardes(final Set<Guarde> utilisateurGuardes) {
        this.utilisateurGuardes = utilisateurGuardes;
    }

    public Set<Message> getExpediteurMessages() {
        return expediteurMessages;
    }

    public void setExpediteurMessages(final Set<Message> expediteurMessages) {
        this.expediteurMessages = expediteurMessages;
    }

    public Set<Message> getDestinataireMessages() {
        return destinataireMessages;
    }

    public void setDestinataireMessages(final Set<Message> destinataireMessages) {
        this.destinataireMessages = destinataireMessages;
    }

}
