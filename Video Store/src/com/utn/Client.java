package com.utn;

public class Client {
    private String name;
    private long phoneNumber;
    private String direction;

    public Client(){

    }

    public Client(String name, long phoneNumber, String direction){
        this.name= name;
        this.phoneNumber= phoneNumber;
        this.direction= direction;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Cliente= nombre: " + name +
                ", telefono: " + phoneNumber + ", direccion: " + direction + ".";
    }
}
