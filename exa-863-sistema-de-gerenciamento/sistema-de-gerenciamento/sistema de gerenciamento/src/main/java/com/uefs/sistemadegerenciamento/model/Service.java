package com.uefs.sistemadegerenciamento.model;

public class Service {
    private String name;
    private String description;
    private double price;
    private double cost;

    public Service(String name, String description, double price, double cost) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
