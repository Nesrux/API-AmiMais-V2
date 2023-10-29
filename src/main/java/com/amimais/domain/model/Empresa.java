package com.amimais.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;
@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Empresa {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cnpj;

    private String Telefone;

    private Set<Usuario> funcionarios = new HashSet<>();

    @Embedded
    private Endereco endereco;


}
