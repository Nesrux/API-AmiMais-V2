package com.amimais.domain.service;

import com.amimais.domain.exceptions.AnimalNaoEncontradoException;
import com.amimais.domain.model.Animal;
import com.amimais.domain.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroAnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public Animal cadastrarAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public Animal acharOuFalhar(Long id) {
        return animalRepository.findById(id)
                .orElseThrow(() -> new AnimalNaoEncontradoException
                        (String.format("O animal de id %d não existe", id)));
    }

    public List<Animal> buscarTodos() {
        return animalRepository.findAll();
    }
}
