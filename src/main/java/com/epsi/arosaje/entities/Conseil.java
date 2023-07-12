package com.epsi.arosaje.entities;
import jakarta.persistence.*;

import java.time.OffsetDateTime;


@Entity
@Table(name = "Conseil")
public class Conseil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    private Integer conseilId;
    @Column(columnDefinition = "text")
    private String contenu;

    @Column
    private OffsetDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "botaniste_id")
    private Botaniste botaniste;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plante_id")
    private Plante plante;

    public Integer getConseilId() {
        return conseilId;
    }

    public void setConseilId(final Integer conseilId) {
        this.conseilId = conseilId;
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

    public Botaniste getBotaniste() {
        return botaniste;
    }

    public void setBotaniste(final Botaniste botaniste) {
        this.botaniste = botaniste;
    }

    public Plante getPlante() {
        return plante;
    }

    public void setPlante(final Plante plante) {
        this.plante = plante;
    }

}
