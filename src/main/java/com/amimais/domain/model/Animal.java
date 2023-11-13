package com.amimais.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Animal {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario tutor;

    @Column(name = "data_aniversario")
    private Date dataAniversario;

//    @ManyToOne
//    @JoinColumn(name = "ong_id")
//    private Empresa ong;
//
}
