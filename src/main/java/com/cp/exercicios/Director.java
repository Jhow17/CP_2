package com.cp.exercicios;

public class Director extends Manager{
    private double porcentagemParticipacaoLucros;

    public Director(String name, String cpf, Double wage, Double bonus, double porcentagemParticipacaoLucros) {
        super(name, cpf, wage, bonus);
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;

    }

    public double getPorcentagemParticipacaoLucros() {
        return porcentagemParticipacaoLucros;
    }

    public void setPorcentagemParticipacaoLucros(double porcentagemParticipacaoLucros) {
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }

    @Override
    public Double getWage(){
        return super.getWage() + bonus + super.getWage() * porcentagemParticipacaoLucros;
    }
}
