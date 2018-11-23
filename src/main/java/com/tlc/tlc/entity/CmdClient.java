package com.tlc.tlc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class CmdClient implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCmd;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToMany(mappedBy = "cmdClient")
    private List<LigneCmdClt> ligneCmdClts;
}
