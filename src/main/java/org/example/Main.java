package org.example;

import com.cp.exercicios.Manager;
import com.cp.exercicios.Director;
import com.cp.exercicios.Employee;
import com.cp.exercicios.Departament;

public class Main {
    public static void main (String[] args){
        Employee E1 = new Employee();

        Manager M1 = new Manager();

        Director D1 = new Director();

        System.out.println(E1.getName() + "final wage:" + E1.getWage());
        System.out.println(D1.getname() + "final wage:" + E1.getWage());
        System.out.println(M1.getName() + "final wage:" + E1.getWage());

        E1.aumentaWage();
        D1.aumentaWage(20);
        M1.aumentaWage(15, 500);

        // departamento, tem na main mas falta criar o departamneto, logo vai dar erro!!!!!!
        System.out.println(E1.getName() + "final wage:" + E1.getWage());
        System.out.println(D1.getName() + "final wage:" + E1.getWage());
        System.out.println(M1.getName() + "final wage:" + E1.getWage());


        Departament dep = new Departament(5);
        dep.addEmployee(E1);
        dep.addEmployee(M1);
        dep.addEmployee(D1);


        System.out.println("/n folha total do dep: " + dep.calcularFolhaDepartament());

    }

}