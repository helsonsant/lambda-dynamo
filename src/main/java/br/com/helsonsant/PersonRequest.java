package br.com.helsonsant;

import lombok.Data;
@Data
public class PersonRequest {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
}