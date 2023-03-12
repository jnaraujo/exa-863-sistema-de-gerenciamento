package com.uefs.sistemadegerenciamento.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingServiceTest {

    @Test
    void testBuildingService() {
        BuildingService buildingService = new BuildingService(
                "Adiciona memória RAM",
                "Adiciona 2 memórias RAM de 8GB 2400MHz"
        );

        buildingService.addComponent(new ComputerComponent(
                "HYPERX 8GB 2400MHz",
                "HYPERX",
                "123456789",
                200.0,
                100.0
        ));
        buildingService.addComponent(new ComputerComponent(
                "HYPERX 8GB 2400MHz",
                "HYPERX",
                "59595952",
                200.0,
                125.5
        ));

        assertEquals(400.0, buildingService.getPrice());
        assertEquals(225.5, buildingService.getCost());
        assertEquals(2, buildingService.getUsedComponents().size());
        assertEquals("123456789", buildingService.getUsedComponents().get(0).getSerialNumber());
        assertEquals("59595952", buildingService.getUsedComponents().get(1).getSerialNumber());
    }

}