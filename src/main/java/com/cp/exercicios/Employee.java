package com.cp.exercicios;

public class Employee {
    String name;
    String cpf;
    private Double wage;

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

    public void aumentaWage(){
        this.wage *= 1.10;
    }

    public void aumentaWage( double porcent){
        this.wage *= (1 + porcent/ 100.0);
    }

    public void aumentaWage( double porcent, double bonus){
        this.wage *= this.wage + (1 + porcent/100.0) + bonus;
    }
}

