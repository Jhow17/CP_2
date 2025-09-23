package com.cp.exercicios;

public class Employee {
    String name;
    String cpf;
    Double wage;

    public Employee(String name, String cpf, Double wage) {
        this.name = name;
        this.cpf = cpf;
        this.wage = wage;
    }

    public Employee() {

    }

    public Double getWage() {
        return wage;
    }
}