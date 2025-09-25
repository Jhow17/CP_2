package org.example;

import com.cp.exercicios.Manager;
import com.cp.exercicios.Director;
import com.cp.exercicios.Employee;
import com.cp.exercicios.Departament;

public class Main {
    public static void main (String[] args){
        Employee E1 = new Employee("João Silva ", "123.456.789-00", 30.00);
        Employee E2 = new Employee("Pedro Santos ", "222.333.444-55", 45.00);
        Employee E3 = new Employee("Ana Pereira ", "666.777.888-99", 38.00);

        Manager M1 = new Manager("Fernando Oliveira ", "987.654.321-01", 50.00, 5.00);
        Manager M2 = new Manager("Ricardo Martins ", "333.444.555-66", 70.00, 10.00);
        Manager M3 = new Manager("Juliana Lima ", "777.888.999-00", 65.00, 8.00);

        Director D1 = new Director("Luciana Costa ", "112.334.556-99", 90.00, 15.00, 25.00);
        Director D2 = new Director("Carlos Alberto ", "444.555.666-77", 95.00, 20.00, 30.00);
        Director D3 = new Director("Roberta Alves ", "888.999.000-11", 88.00, 18.00, 28.00);

        System.out.println(E1.getName() + "final wage: " + E1.getWage());
        System.out.println(D1.getName() + "final wage: " + D1.getWage());
        System.out.println(M1.getName() + "final wage: " + M1.getWage());

        E1.aumentaWage();
        D1.aumentaWage(20);
        M1.aumentaWage(15, 500);

        // departamento, tem na main mas falta criar o departamneto, logo vai dar erro!!!!!!
        System.out.println(E2.getName() + "final wage:" + E2.getWage());
        System.out.println(D2.getName() + "final wage:" + D2.getWage());
        System.out.println(M2.getName() + "final wage:" + M2.getWage());



        Departament TI = new Departament();
        // Cria um array de Employee, Manager e Director
        Employee[] equipe = {D1, M1, E1};

        TI.addEmployees(equipe);

        String folhaFormatada = String.format("%.2f",TI.calcularFolhaDepartament() );



        System.out.println("/n folha total do dep: " + folhaFormatada);

    }

}