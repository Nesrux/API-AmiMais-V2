package com.amimais.domain.exceptions;

public class AnimalNaoEncontradoException extends  NegocioException{
    public AnimalNaoEncontradoException(String message) {
        super(message);
    }
}
