package com.uefs.sistemadegerenciamento.model;

public class ComputerComponent {
    private String name;
    private String manufacturer;
    private String serialNumber;
    private Double price;
    private Double cost;

    public ComputerComponent(String name, String manufacturer, String serialNumber, Double price, Double cost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
