package com.amimais.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Usuario {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany()
    private List<Animal> animais;
//
//    @ManyToOne
//    @JoinColumn(name = "empresa_id")
//    private Empresa empresa;
}
