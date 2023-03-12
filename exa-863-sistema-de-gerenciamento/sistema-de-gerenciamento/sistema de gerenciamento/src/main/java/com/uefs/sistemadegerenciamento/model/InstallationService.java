package com.uefs.sistemadegerenciamento.model;

import java.util.ArrayList;
import java.util.List;

public class InstallationService extends Service{
    private final List<String> programs;
    private String operatingSystem;

    public InstallationService(String name, String description, double price, double cost) {
        super(name, description, price, cost);
        this.programs = new ArrayList<>();
    }

    public List<String> getPrograms() {
        return programs;
    }

    public void addProgram(String program) {
        this.programs.add(program);
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }}
