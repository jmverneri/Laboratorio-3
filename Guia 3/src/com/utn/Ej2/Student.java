package com.utn.Ej2;

public class Student extends Person{
    private int year;
    private double schoolFee;
    private String career;

    public Student(){
        super();
    }

    public Student(String dni, String name, String surname, String email, String adress, int year,
                   double schoolFee, String career){
        super(dni, name, surname, email, adress);
        this.year= year;
        this.schoolFee= schoolFee;
        this.career= career;
    }

    public int getYear(){
        return year;
    }

    public double getSchoolFee(){
        return schoolFee;
    }

    public String getCareer(){
        return career;
    }

    @Override
    public String toString() {
        return "Año de ingreso: " + year +
                ", valor cuota: " + schoolFee +
                ", carrera: " + career +
                ", " + super.toString();
    }
}
