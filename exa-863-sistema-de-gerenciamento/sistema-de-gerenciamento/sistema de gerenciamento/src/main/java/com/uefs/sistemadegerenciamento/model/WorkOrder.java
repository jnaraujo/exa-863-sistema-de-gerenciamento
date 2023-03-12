package com.uefs.sistemadegerenciamento.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkOrder {
    private final String id;
    private Customer customer;
    private Technician technician = null;

    private String status = "Em andamento";
    private String description;
    private List<Service> services = new ArrayList<Service>();
    private Date createdAt;
    private Date finishedAt;

    public WorkOrder(
        String id,
        String description,
        Customer customer
    ) {
        this.id = id;
        this.customer = customer;
        this.description = description;

        this.createdAt = new Date();
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Service> getServices() {
        return services;
    }
    public void addService(Service service) {
        this.services.add(service);
    }
    public double getPrice() {
        double price = 0;
        for (Service service : this.services) {
            price += service.getPrice();
        }
        return price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getFinishedAt() {
        return finishedAt;
    }

    public void finish() throws IllegalStateException{
        if(this.technician == null)
            throw new IllegalStateException("Não é possível finalizar uma ordem de serviço sem um técnico");

        this.status = "Finalizado";
        this.finishedAt = new Date();
    }

    public void cancel() {
        this.status = "Cancelado";
        this.finishedAt = new Date();
    }

    public boolean isFinished() {
        return this.status.equals("Finalizado");
    }

    public boolean isCanceled() {
        return this.status.equals("Cancelado");
    }

    public boolean isOngoing() {
        return this.status.equals("Em andamento");
    }

}
