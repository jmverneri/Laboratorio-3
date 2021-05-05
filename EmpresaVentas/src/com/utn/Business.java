package com.utn;

import java.util.*;

public class Business {

    private List <Client> clientsList = new ArrayList<>();
    private List <Product> productsList = new ArrayList<>();
    private List <Order> ordersList= new ArrayList<>();

    public Business(List <Client> clientsList, List <Product> productsList, List <Order> ordersList){
        this.clientsList= clientsList;
        this.productsList= productsList;
        this.ordersList= ordersList;
    }

    public void setClientsList(List<Client> clientsList) {
        this.clientsList = clientsList;
    }

    public List<Client> getClientsList() {
        return clientsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setOrdersList(List<Order> ordersList) {
        this.ordersList = ordersList;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }
}
