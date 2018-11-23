package com.tlc.tlc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Vente implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVente;
    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes;
}
