package com.amimais.domain.exceptions.entidade;

import com.amimais.domain.exceptions.NegocioException;

public abstract class EntidadeNaoEncontradaException extends NegocioException {

    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }
}
