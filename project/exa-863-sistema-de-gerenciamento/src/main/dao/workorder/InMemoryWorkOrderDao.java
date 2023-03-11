package main.dao.workorder;

import main.model.WorkOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryWorkOrderDao implements WorkOrderDao {
    private HashMap<String, WorkOrder> workOrders = new HashMap<>();
    @Override
    public void save(WorkOrder workOrder) {
        workOrders.put(workOrder.getId(), workOrder);
    }

    @Override
    public void delete(WorkOrder workOrder) {
        workOrders.remove(workOrder.getId());
    }

    @Override
    public void update(WorkOrder workOrder) {
        workOrders.replace(workOrder.getId(), workOrder);
    }

    @Override
    public WorkOrder findById(int id) {
        return workOrders.get(id);
    }

    @Override
    public List<WorkOrder> getAll() {
        return new ArrayList<>(workOrders.values());
    }
}
