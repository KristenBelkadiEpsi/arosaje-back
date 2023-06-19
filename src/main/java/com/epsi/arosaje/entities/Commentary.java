package com.epsi.arosaje.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.*;

@Entity
@Getter
@Setter
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","ask"})
public class Commentary {
    @Id
    @GeneratedValue(strategy= IDENTITY)
    private Long id;

    @Column(length=5000, nullable=false)
    private String commentary;
    @ManyToOne
    @JoinColumn(name="ask_id")
    private Ask ask;

    public Commentary() {}
}
