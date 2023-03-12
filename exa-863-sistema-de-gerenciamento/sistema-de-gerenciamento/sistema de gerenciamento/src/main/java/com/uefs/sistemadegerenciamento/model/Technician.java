package com.uefs.sistemadegerenciamento.model;

public class Technician extends User{
    private WorkOrder workOrder;
    public Technician(
        String id,
        String name,
        String email
    ) {
        super(id, name, email);
    }

    public WorkOrder getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrder workOrder) {
        this.workOrder = workOrder;
    }
}
