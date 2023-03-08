package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorkOrderTest {

    Customer customer;
    Technician technician;

    @BeforeEach
    void setUp() {
        customer = new Customer(
                "1",
                "John Doe",
                "123 Main St",
                "555-555-5555",
                "teste@test.com"
        );

        technician = new Technician(
                "2",
                "João da Silva",
                "joao@test.com"
        );
    }


    @Test
    void testWorkOrderCreation() {
        WorkOrder workOrder = new WorkOrder(
                "1",
                "urgent work order",
                this.customer
        );

        assertNotNull(workOrder);
    }

    @Test
    void testWorkOrderFinishWithoutTechnician() {
        WorkOrder workOrder = new WorkOrder(
                "1",
                "customer is complaining",
                this.customer
        );

        workOrder.addService(new Service(
                "Fix RAM",
                "RAM is broken",
                100.00,
                50.00
        ));

        assertThrows(IllegalStateException.class, workOrder::finish);
    }

    @Test
    void testWorkOrderFinish() {
        WorkOrder workOrder = new WorkOrder(
                "1",
                "customer is complaining",
                this.customer
        );

        workOrder.setTechnician(this.technician);

        workOrder.addService(new Service(
                "Fix RAM",
                "RAM is broken",
                100.00,
                50.00
        ));

        workOrder.finish();

        assertEquals("Finalizado", workOrder.getStatus());

    }

    @Test
    void testWorkOrderAddService() {
        WorkOrder workOrder = new WorkOrder(
                "1",
                "customer is complaining",
                this.customer
        );

        workOrder.addService(new Service(
                "Fix RAM",
                "RAM is broken",
                100.00,
                50.00
        ));

        workOrder.addService(new Service(
                "Fix CPU",
                "CPU is broken",
                200.00,
                100.00
        ));

        List<Service> services = workOrder.getServices();

        assertEquals(2, services.size());
        assertEquals("Fix RAM", services.get(0).getName());
        assertEquals("RAM is broken", services.get(0).getDescription());

        assertEquals("Fix CPU", services.get(1).getName());
        assertEquals("CPU is broken", services.get(1).getDescription());

        assertEquals(300.00, workOrder.getPrice());
    }
}