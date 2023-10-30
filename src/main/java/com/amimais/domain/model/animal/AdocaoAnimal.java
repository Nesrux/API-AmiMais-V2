package com.amimais.domain.model.animal;

import com.amimais.domain.model.User.Usuario;
import com.amimais.domain.model.empresa.Empresa;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.OffsetDateTime;
@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AdocaoAnimal {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Usuario adotante;

    private Empresa ong;

    @Enumerated(EnumType.STRING)
    private StatusAdocao statusAdocao;

    private OffsetDateTime dataAdocao;

    @UpdateTimestamp
    private OffsetDateTime ultimaAtualizacao;
}
