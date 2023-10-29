package com.amimais.domain.model.endereco;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Endereco {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Cidade cidade;

    private String cep;

    private String logradouro;

    private String numero;
}
