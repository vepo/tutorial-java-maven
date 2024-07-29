package com.exemplo;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        var jsonContent = """
                          {
                            "nome": "John Doe",
                            "idade": 30,
                            "email": "john.doe@example.com"
                          }
                          """;

        var usuario = Usuario.fromJson(jsonContent);
        System.out.println(usuario);
    }
}
