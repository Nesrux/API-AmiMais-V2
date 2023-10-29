package com.amimais.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.OffsetDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Animal {
    private Long id;
    private String nome;
    private Usuario dono;
    private OffsetDateTime dataAtualizacao;
    private OffsetDateTime dataCriacao;

}
