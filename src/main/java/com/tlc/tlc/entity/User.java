package com.tlc.tlc.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Data
public class User implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String photo;
}
