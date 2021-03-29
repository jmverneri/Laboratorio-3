package com.utn.punto2;

public class Empleado {
    private int dni;
    private String name;
    private String surname;
    private double salary;

    public Empleado(){

    }
    public Empleado(int dni, String name, String surname, double salary){
        this.dni= dni;
        this.name= name;
        this.surname= surname;
        this.salary= salary;
    }
    public int getDni(){
        return dni;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public double getSalary(){
        return salary;
    }
    public double anualSalary(){
        return 12 * salary;
    }
    public void increaseSalary(double percentage){
        this.salary= this.salary + (this.salary * (percentage / 100));
    }
    public String getEmpleado(){
        return "Empleado[dni=" + this.dni + " nombre=" + this.name + " apellido=" + this.surname +
                " salario=" + this.salary + "]";
    }
}
