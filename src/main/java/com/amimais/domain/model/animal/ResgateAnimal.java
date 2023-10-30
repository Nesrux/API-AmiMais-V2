package com.amimais.domain.model.animal;

import com.amimais.domain.model.User.Usuario;
import com.amimais.domain.model.empresa.Empresa;
import com.amimais.domain.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ResgateAnimal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private Empresa ong;

    private Usuario denunciante;

    private Animal animal;

    private String descricao;

    @Embedded
    private Endereco enderecoDaOcorrencia;

    private StatusResgate status;
}
