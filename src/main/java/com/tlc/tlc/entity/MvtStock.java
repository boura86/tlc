package com.tlc.tlc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class MvtStock implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateMvt;
    private BigDecimal quantite;
    private int typeMvt;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
}
