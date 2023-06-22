package com.epsi.arosaje.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Botanist {

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
    private User user;

    @OneToMany(mappedBy = "botanist")
    private Set<Tip> botanistTipsses;

    public Integer getBotanistId() {
        return botanistId;
    }

    public void setBotanistId(final Integer botanistId) {
        this.botanistId = botanistId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public Set<Tip> getBotanistTipss() {
        return botanistTipsses;
    }

    public void setBotanistTipss(final Set<Tip> botanistTipsses) {
        this.botanistTipsses = botanistTipsses;
    }

}
