package com.amimais.domain.model.empresa;

import com.amimais.domain.model.User.Usuario;
import com.amimais.domain.model.animal.Animal;
import com.amimais.domain.model.endereco.Endereco;
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

    @OneToMany(mappedBy = "empresa")
    private Set<Animal> animais = new HashSet<>();

    @Embedded
    private Endereco endereco;


}
