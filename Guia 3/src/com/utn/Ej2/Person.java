package com.utn.Ej2;

public class Person {
    protected String dni;
    protected String name;
    protected String surname;
    protected String email;
    protected String adress;

    public Person(){

    }

    public Person(String dni, String name, String surname, String email, String adress){
        this.dni= dni;
        this.name= name;
        this.surname= surname;
        this.email= email;
        this.adress= adress;
    }

    public void setDni(String dni){
        this.dni= dni;
    }

    public String getDni(){
        return dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "DNI: " + dni +
                ", nombre: " + name +
                ", apellido: " + surname +
                ", email: " + email +
                ", direccion: " + adress;
    }
}
