package com.epsi.arosaje.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Botanists {

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
    private Integer botanistId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    @OneToMany(mappedBy = "botanist")
    private Set<Tips> botanistTipss;

    public Integer getBotanistId() {
        return botanistId;
    }

    public void setBotanistId(final Integer botanistId) {
        this.botanistId = botanistId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(final Users user) {
        this.user = user;
    }

    public Set<Tips> getBotanistTipss() {
        return botanistTipss;
    }

    public void setBotanistTipss(final Set<Tips> botanistTipss) {
        this.botanistTipss = botanistTipss;
    }

}
