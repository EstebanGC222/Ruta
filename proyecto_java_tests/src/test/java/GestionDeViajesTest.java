import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.example.GestionDeViajes.Viaje;
import org.example.GestionDeViajes.ViajeRepositorio;
import org.example.GestionDeViajes.GestionDeViajesServicio;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GestionDeViajesTest {

    @Mock
    private ViajeRepositorio viajeRepositorio;

    @InjectMocks
    private GestionDeViajesServicio gestionDeViajesServicio;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testObtenerTiempoLlegada() {
        // Preparar datos de prueba
        String viajeId = "123";
        Viaje viajeEsperado = new Viaje(viajeId, "5 minutos", "30 minutos", "45 minutos", "10 minutos", "historial", "5 USD");

        // Configurar comportamiento simulado del repositorio
        when(viajeRepositorio.obtenerTiempoLlegada(viajeId)).thenReturn(viajeEsperado);

        // Llamar al método a probar
        Viaje viaje = gestionDeViajesServicio.obtenerTiempoLlegada(viajeId);

        // Verificar los resultados
        assertEquals(viajeEsperado, viaje);
        verify(viajeRepositorio, times(1)).obtenerTiempoLlegada(viajeId);
    }

    @Test
    public void testEstimarTiempoDeViaje() {
        // Preparar datos de prueba
        String viajeId = "123";
        Viaje viajeEsperado = new Viaje(viajeId, "5 minutos", "30 minutos", "45 minutos", "10 minutos", "historial", "5 USD");

        // Configurar comportamiento simulado del repositorio
        when(viajeRepositorio.estimarTiempoDeViaje(viajeId)).thenReturn(viajeEsperado);

        // Llamar al método a probar
        Viaje viaje = gestionDeViajesServicio.estimarTiempoDeViaje(viajeId);

        // Verificar los resultados
        assertEquals(viajeEsperado, viaje);
        verify(viajeRepositorio, times(1)).estimarTiempoDeViaje(viajeId);
    }

    @Test
    public void testEstimarTiempoDeFinalizacion() {
        // Preparar datos de prueba
        String viajeId = "123";
        Viaje viajeEsperado = new Viaje(viajeId, "5 minutos", "30 minutos", "45 minutos", "10 minutos", "historial", "5 USD");

        // Configurar comportamiento simulado del repositorio
        when(viajeRepositorio.estimarTiempoDeFinalizacion(viajeId)).thenReturn(viajeEsperado);

        // Llamar al método a probar
        Viaje viaje = gestionDeViajesServicio.estimarTiempoDeFinalizacion(viajeId);

        // Verificar los resultados
        assertEquals(viajeEsperado, viaje);
        verify(viajeRepositorio, times(1)).estimarTiempoDeFinalizacion(viajeId);
    }

    @Test
    public void testEstimarTiempoEntreEstaciones() {
        // Preparar datos de prueba
        String viajeId = "123";
        Viaje viajeEsperado = new Viaje(viajeId, "5 minutos", "30 minutos", "45 minutos", "10 minutos", "historial", "5 USD");

        // Configurar comportamiento simulado del repositorio
        when(viajeRepositorio.estimarTiempoEntreEstaciones(viajeId)).thenReturn(viajeEsperado);

        // Llamar al método a probar
        Viaje viaje = gestionDeViajesServicio.estimarTiempoEntreEstaciones(viajeId);

        // Verificar los resultados
        assertEquals(viajeEsperado, viaje);
        verify(viajeRepositorio, times(1)).estimarTiempoEntreEstaciones(viajeId);
    }

    @Test
    public void testObtenerHistorialDeViajes() {
        // Preparar datos de prueba
        String clienteId = "456";
        Viaje viajeEsperado = new Viaje("123", "5 minutos", "30 minutos", "45 minutos", "10 minutos", "historial completo", "5 USD");

        // Configurar comportamiento simulado del repositorio
        when(viajeRepositorio.obtenerHistorialDeViajes(clienteId)).thenReturn(viajeEsperado);

        // Llamar al método a probar
        Viaje viaje = gestionDeViajesServicio.obtenerHistorialDeViajes(clienteId);

        // Verificar los resultados
        assertEquals(viajeEsperado, viaje);
        verify(viajeRepositorio, times(1)).obtenerHistorialDeViajes(clienteId);
    }

    @Test
    public void testObtenerInformacionDeTarifas() {
        // Preparar datos de prueba
        String viajeId = "123";
        Viaje viajeEsperado = new Viaje(viajeId, "5 minutos", "30 minutos", "45 minutos", "10 minutos", "historial", "5 USD");

        // Configurar comportamiento simulado del repositorio
        when(viajeRepositorio.obtenerInformacionDeTarifas(viajeId)).thenReturn(viajeEsperado);

        // Llamar al método a probar
        Viaje viaje = gestionDeViajesServicio.obtenerInformacionDeTarifas(viajeId);

        // Verificar los resultados
        assertEquals(viajeEsperado, viaje);
        verify(viajeRepositorio, times(1)).obtenerInformacionDeTarifas(viajeId);
    }
}
