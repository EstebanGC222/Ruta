import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.example.GestionDeAlertas.Alerta;
import org.example.GestionDeAlertas.AlertaRepositorio;
import org.example.GestionDeAlertas.GestionDeAlertasServicio;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GestionDeAlertasTest {

    @Mock
    private AlertaRepositorio alertaRepositorio;

    @InjectMocks
    private GestionDeAlertasServicio gestionDeAlertasServicio;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNotificarRetrasos() {
        // Preparar datos de prueba
        String alertaId = "123";
        Alerta alertaEsperada = new Alerta(alertaId, "Retraso de 15 minutos", "No hay mantenimiento", "No hay problemas en la ruta", "Tráfico normal");

        // Configurar comportamiento simulado del repositorio
        when(alertaRepositorio.notificarRetrasos(alertaId)).thenReturn(alertaEsperada);

        // Llamar al método a probar
        Alerta alerta = gestionDeAlertasServicio.notificarRetrasos(alertaId);

        // Verificar los resultados
        assertEquals(alertaEsperada, alerta);
        verify(alertaRepositorio, times(1)).notificarRetrasos(alertaId);
    }

    @Test
    public void testAlertarMantenimiento() {
        // Preparar datos de prueba
        String alertaId = "123";
        Alerta alertaEsperada = new Alerta(alertaId, "Retraso de 15 minutos", "Mantenimiento en progreso", "No hay problemas en la ruta", "Tráfico normal");

        // Configurar comportamiento simulado del repositorio
        when(alertaRepositorio.alertarMantenimiento(alertaId)).thenReturn(alertaEsperada);

        // Llamar al método a probar
        Alerta alerta = gestionDeAlertasServicio.alertarMantenimiento(alertaId);

        // Verificar los resultados
        assertEquals(alertaEsperada, alerta);
        verify(alertaRepositorio, times(1)).alertarMantenimiento(alertaId);
    }

    @Test
    public void testReportarProblemasEnRuta() {
        // Preparar datos de prueba
        String alertaId = "123";
        Alerta alertaEsperada = new Alerta(alertaId, "Retraso de 15 minutos", "No hay mantenimiento", "Problema en la ruta detectado", "Tráfico normal");

        // Configurar comportamiento simulado del repositorio
        when(alertaRepositorio.reportarProblemasEnRuta(alertaId)).thenReturn(alertaEsperada);

        // Llamar al método a probar
        Alerta alerta = gestionDeAlertasServicio.reportarProblemasEnRuta(alertaId);

        // Verificar los resultados
        assertEquals(alertaEsperada, alerta);
        verify(alertaRepositorio, times(1)).reportarProblemasEnRuta(alertaId);
    }

    @Test
    public void testAlertarTrafico() {
        // Preparar datos de prueba
        String alertaId = "123";
        Alerta alertaEsperada = new Alerta(alertaId, "Retraso de 15 minutos", "No hay mantenimiento", "No hay problemas en la ruta", "Tráfico denso");

        // Configurar comportamiento simulado del repositorio
        when(alertaRepositorio.alertarTrafico(alertaId)).thenReturn(alertaEsperada);

        // Llamar al método a probar
        Alerta alerta = gestionDeAlertasServicio.alertarTrafico(alertaId);

        // Verificar los resultados
        assertEquals(alertaEsperada, alerta);
        verify(alertaRepositorio, times(1)).alertarTrafico(alertaId);
    }
}

