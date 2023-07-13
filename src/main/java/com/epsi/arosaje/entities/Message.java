package com.epsi.arosaje.entities;

import jakarta.persistence.*;

import java.time.OffsetDateTime;


@Entity
@Table(name = "Message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer messageId;

    @Column(columnDefinition = "text")
    private String contenu;

    @Column
    private OffsetDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expediteur_id")
    private Utilisateur expediteur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destinataire_id")
    private Utilisateur destinataire;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(final Integer messageId) {
        this.messageId = messageId;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(final String contenu) {
        this.contenu = contenu;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(final OffsetDateTime date) {
        this.date = date;
    }

    public Utilisateur getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(final Utilisateur expediteur) {
        this.expediteur = expediteur;
    }

    public Utilisateur getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(final Utilisateur destinataire) {
        this.destinataire = destinataire;
    }

    @Override
    public String toString() {
        return "Message{" + "messageId=" + messageId + ", contenu='" + contenu + '\'' + ", date=" + date + '}';
    }
}
