package com.tlc.tlc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
public class LigneVente implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vente_id")
    private Vente vente;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
