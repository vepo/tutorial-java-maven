package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class UsuarioTest {

    @Test
    public void parserTest() {
        var usuario = Usuario.fromJson("""
                                       {
                                         "nome": "John Doe",
                                         "idade": 30,
                                         "email": "john.doe@corp.com"
                                       }
                                       """);
        assertNotNull(usuario, "Usuário não pode ser nulo");
        assertEquals("John Doe", usuario.nome(), "Nome do usuário não confere");
        assertEquals(30, usuario.idade(), "Idade do usuário não confere");
        assertEquals("john.doe@corp.com", usuario.email(), "Email do usuário não confere");
    }
}
