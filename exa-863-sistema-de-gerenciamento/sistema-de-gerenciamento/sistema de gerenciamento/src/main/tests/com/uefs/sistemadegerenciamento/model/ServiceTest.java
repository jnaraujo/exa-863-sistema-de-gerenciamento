package com.uefs.sistemadegerenciamento.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    @Test
    void testService() {
        Service service = new Service(
                "Service 1",
                "This is a description",
                100.00,
                50.00
        );

        assertEquals("Service 1", service.getName());
        assertEquals("This is a description", service.getDescription());
        assertEquals(100.00, service.getPrice());
        assertEquals(50.00, service.getCost());
    }
}