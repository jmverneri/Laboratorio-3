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

    public void setName(String name){
        this.name= name;
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
}
