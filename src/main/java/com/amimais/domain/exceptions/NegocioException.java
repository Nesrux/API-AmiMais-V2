package com.amimais.domain.exceptions;

public class NegocioException extends  RuntimeException{
    public NegocioException(String message) {
        super(message);
    }
}