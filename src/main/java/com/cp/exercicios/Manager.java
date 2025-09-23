package com.cp.exercicios;

public class Manager extends Employee{
    Double bonus ;


    public Manager(String name, String cpf, Double wage, Double bonus) {
        super(name, cpf, wage);
        this.bonus = bonus;
    }

    @Override
    public Double getWage() {
        return (super.getWage() * this.bonus);
    }

}