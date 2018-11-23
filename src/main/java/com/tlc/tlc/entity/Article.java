package com.tlc.tlc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Article implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String libelle;
    private BigDecimal prixUnitaire;
    private BigDecimal tauxTva;
    private BigDecimal prixUnitaireTTC;
    private String photo;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}
