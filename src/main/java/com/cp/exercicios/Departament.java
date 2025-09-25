package com.cp.exercicios;

public class Departament {
    private Employee[] employees = new Employee[10];

    public Departament(Employee[] employees) {
        addEmployees(employees);
    }
    public Departament(){

    }

    public void addEmployees(Employee[] newEmployees) {
        if (newEmployees.length + employees.length > 10){
            this.employees = newEmployees;
        }
        else {
            System.out.println("Numero de funcionarios ultrapassa a capacidade de um departamento");
        }

    }

    public Double calcularFolhaDepartament(){
        Double totalPayRoll = 0.0;
        for (Employee employ : employees){
            totalPayRoll += employ.getWage();
        }
        return totalPayRoll;
    }


}
