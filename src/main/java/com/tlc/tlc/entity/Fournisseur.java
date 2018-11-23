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
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String photo;
    private String email;
    @OneToMany(mappedBy = "fournisseur")
    private List<CmdFour> cmdFours;
}
