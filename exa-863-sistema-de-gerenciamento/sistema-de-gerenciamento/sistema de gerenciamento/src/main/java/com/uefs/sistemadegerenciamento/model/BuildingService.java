package com.uefs.sistemadegerenciamento.model;

import java.util.ArrayList;
import java.util.List;

public class BuildingService extends Service{
    private List<ComputerComponent> usedComponents = new ArrayList<>();
    public BuildingService(String name, String description) {
        super(name, description, 0, 0);
    }

    public List<ComputerComponent> getUsedComponents() {
        return usedComponents;
    }

    public void addComponent(ComputerComponent component) {
        this.usedComponents.add(component);
    }

    @Override
    public double getCost() {
        double cost = 0;
        for (ComputerComponent component : usedComponents) {
            cost += component.getCost();
        }
        return cost;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (ComputerComponent component : usedComponents) {
            price += component.getPrice();
        }
        return price;
    }
}
