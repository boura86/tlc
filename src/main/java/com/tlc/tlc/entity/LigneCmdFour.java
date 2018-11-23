package com.tlc.tlc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
public class LigneCmdFour implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "cmdFour_id")
    private CmdFour cmdFour;
}
