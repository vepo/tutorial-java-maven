package com.exemplo;

import java.security.InvalidParameterException;

import com.fasterxml.jackson.databind.ObjectMapper;

public record Usuario(String nome, int idade, String email) {

    public static Usuario fromJson(String jsonContent) {
        var mapper = new ObjectMapper();
        try {
            return mapper.readValue(jsonContent, Usuario.class);
        } catch (Exception e) {
            throw new InvalidParameterException("Erro ao converter json para Usuario", e);
        }
    }
}
