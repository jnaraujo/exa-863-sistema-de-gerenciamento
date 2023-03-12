package com.uefs.sistemadegerenciamento.model;

import java.util.ArrayList;
import java.util.List;

public class CleaningService extends Service{
    private final List<String> components;

    public CleaningService(String name, String description, double price, double cost) {
        super(name, description, price, cost);
        this.components = new ArrayList<>();
    }

    public List<String> getComponents() {
        return components;
    }

    public void addComponent(String component) {
        this.components.add(component);
    }
}
