package com.itteam.prueba.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "prices")
public class Price implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double precio;

    @OneToOne
    @JoinColumn(name = "id_offer")
    private Offer offer;

}
