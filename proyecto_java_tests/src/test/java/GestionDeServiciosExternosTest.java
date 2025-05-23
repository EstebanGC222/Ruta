
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.example.ServiciosExternos.ServicioExternoRepositorio;
import org.example.ServiciosExternos.ServicioExterno;
import org.example.ServiciosExternos.GestionDeServiciosExternosServicio;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GestionDeServiciosExternosTest {

    @Mock
    private ServicioExternoRepositorio servicioExternoRepositorio;

    @InjectMocks
    private GestionDeServiciosExternosServicio gestionDeServiciosExternosServicio;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMonitorearCondicionesClimaticas() {
        // Preparar datos de prueba
        String servicioId = "123";
        ServicioExterno servicioEsperado = new ServicioExterno(servicioId, "Lluvias", "Español");

        // Configurar comportamiento simulado del repositorio
        when(servicioExternoRepositorio.monitorearCondicionesClimaticas(servicioId)).thenReturn(servicioEsperado);

        // Llamar al método a probar
        ServicioExterno servicio = gestionDeServiciosExternosServicio.monitorearCondicionesClimaticas(servicioId);

        // Verificar los resultados
        assertEquals(servicioEsperado, servicio);
        verify(servicioExternoRepositorio, times(1)).monitorearCondicionesClimaticas(servicioId);
    }

    @Test
    public void testSoporteMultilenguaje() {
        // Preparar datos de prueba
        String servicioId = "123";
        ServicioExterno servicioEsperado = new ServicioExterno(servicioId, "Lluvias", "Español");

        // Configurar comportamiento simulado del repositorio
        when(servicioExternoRepositorio.soporteMultilenguaje(servicioId)).thenReturn(servicioEsperado);

        // Llamar al método a probar
        ServicioExterno servicio = gestionDeServiciosExternosServicio.soporteMultilenguaje(servicioId);

        // Verificar los resultados
        assertEquals(servicioEsperado, servicio);
        verify(servicioExternoRepositorio, times(1)).soporteMultilenguaje(servicioId);
    }
}
