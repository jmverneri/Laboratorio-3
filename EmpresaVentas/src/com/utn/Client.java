package com.utn;

public class Client {

    private String name;
    private String adress;
    private int telephone;

    public Client(String name, String adress, int telephone){
        this.name= name;
        this.adress= adress;
        this.telephone= telephone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getTelephone() {
        return telephone;
    }
}
