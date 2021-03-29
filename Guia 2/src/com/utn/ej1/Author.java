package com.utn.ej1;

public class Author {
    private String name;
    private String surname;
    private String email;
    private char gender;

    public Author(){

    }
    public Author(String name, String surname, String email, char gender){
        this.name= name;
        this.surname= surname;
        this.email= email;
        this.gender= gender;
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

    }

    public String getEmail() {
        return email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }
    /*
    public String getAutor(){
        return "Autor [Nombre: " + getName() + ", Apellido: " + getSurname() + ", email: "
                + getEmail() + ", genero: " + getGender() + "]";
    }
    Se usa el toString para no crear una funcion ya creada por el Object
     */

    @Override
    public String toString() {
        return "Autor {" + "Nombre: " + name + ", Apellido: " + surname +
        ", email: " + email + ", genero: " + gender + "}";
    }
}
