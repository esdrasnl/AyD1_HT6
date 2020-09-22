/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author esdras
 */
public class ESDRASJONATANNOJLARIOS_201513699Test {
    
    RegistroAcademico mockito;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mockito = mock(RegistroAcademico.class);
        when(mockito.cheequearCarnet()).thenReturn(false);
        when(mockito.cheequearCarnet()).thenReturn(true);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCarrera() throws Exception {
        System.out.println("Carrera Validación");
        mockito = new RegistroAcademico(10,"111");
        assertNotNull(mockito.cheequearCarnet());
    }
    
    @Test
    public void testCarnet() throws Exception {
        System.out.println("Carnet Validación");
        mockito = new RegistroAcademico(10,"");
        boolean mockEstado = mockito.cheequearCarnet();
        assertFalse(mockEstado);
    }
    
    
    
}
