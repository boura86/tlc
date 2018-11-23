package com.tlc.tlc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
public class LigneCmdClt implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "cmdClient_id")
    private CmdClient cmdClient;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
