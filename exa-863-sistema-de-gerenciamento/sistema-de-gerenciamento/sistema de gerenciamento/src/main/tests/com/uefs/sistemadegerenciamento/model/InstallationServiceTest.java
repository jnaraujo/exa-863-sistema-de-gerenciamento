package com.uefs.sistemadegerenciamento.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstallationServiceTest {
    @Test
    void testInstallation() {
        InstallationService installationService = new InstallationService("Instalação de Windows", "Instalação de Windows 10", 50.0, 25.0);
        installationService.setOperatingSystem("Windows 10");
        installationService.addProgram("Office");
        installationService.addProgram("Photoshop");

        assertEquals(25.0, installationService.getCost());
        assertEquals(50.0, installationService.getPrice());
        assertEquals("Windows 10", installationService.getOperatingSystem());
        assertEquals(2, installationService.getPrograms().size());
        assertEquals("Office", installationService.getPrograms().get(0));
        assertEquals("Photoshop", installationService.getPrograms().get(1));
    }

}