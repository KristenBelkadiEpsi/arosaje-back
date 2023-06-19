package com.epsi.arosaje.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("A")
public class Admin extends User {

    public Admin() {}
}
