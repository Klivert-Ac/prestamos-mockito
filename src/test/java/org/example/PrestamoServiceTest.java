package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PrestamoServiceTest {

    //Test 1
    @Test
    public void testClienteConDeudas() {

        EvaluadorCrediticio mockEvaluador = mock(EvaluadorCrediticio.class);

        when(mockEvaluador.tieneDeudas("Juan")).thenReturn(true);

        PrestamoService service = new PrestamoService(mockEvaluador);

        String resultado = service.registrar("Juan");

        assertEquals("Cliente con deudas pendientes", resultado);
    }

    //Test2
    @Test
    public void testScoreBajo() {

        EvaluadorCrediticio mockEvaluador = mock(EvaluadorCrediticio.class);

        when(mockEvaluador.tieneDeudas("Luis")).thenReturn(false);
        when(mockEvaluador.obtenerScore("Luis")).thenReturn(500);

        PrestamoService service = new PrestamoService(mockEvaluador);

        String resultado = service.registrar("Luis");

        assertEquals("Score insuficiente", resultado);
    }
}
