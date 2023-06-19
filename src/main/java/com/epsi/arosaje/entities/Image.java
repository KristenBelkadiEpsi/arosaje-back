package com.epsi.arosaje.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column( name = "image", columnDefinition = "BLOB")
    private byte[] image;
    @Column( name = "nom" )
    private String fileName;
    @Column( name = "type" )
    private String mimeType;
    @Column( name = "taille" )
    private long size;
    @ManyToOne
    @JoinColumn(name = "ask_id")
    private Ask ask;

    public Image(String fileName, String mimeType, long size, byte[] image) {
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.size = size;
        this.image = image;
    }

    public Image() {

    }
}
