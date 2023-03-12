package com.uefs.sistemadegerenciamento.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CleaningServiceTest {
    @Test
    void testCleaning() {
        CleaningService cleaningService = new CleaningService("Limpeza de Computador", "Limpeza de Computador", 50.0, 25.0);
        cleaningService.addComponent("HD");
        cleaningService.addComponent("Placa Mãe");
        cleaningService.addComponent("Placa de Vídeo");

        assertEquals(25.0, cleaningService.getCost());
        assertEquals(50.0, cleaningService.getPrice());
        assertEquals(3, cleaningService.getComponents().size());
        assertEquals("HD", cleaningService.getComponents().get(0));
        assertEquals("Placa Mãe", cleaningService.getComponents().get(1));
        assertEquals("Placa de Vídeo", cleaningService.getComponents().get(2));
    }
}