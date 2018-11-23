package com.tlc.tlc.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Categorie implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String nom;
    @OneToMany(mappedBy = "categorie")
    private List<Article> articles;
}
