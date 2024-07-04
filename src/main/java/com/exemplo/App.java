package com.exemplo;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public record Person(String name, int age, String email) {}
    public static void main( String[] args )
    {
        var jsonContent = """
                          {
                            "name": "John Doe",
                            "age": 30,
                            "email": "john.doe@example.com"
                          }
                          """;
        var mapper = new ObjectMapper();
        try {
            var person = mapper.readValue(jsonContent, Person.class);
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
