import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.example.GestionDeRutas.Ruta;
import org.example.GestionDeRutas.GestionDeRutasServicio;
import org.example.GestionDeRutas.RutaRepositorio;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GestionDeRutasTest {

    @Mock
    private RutaRepositorio rutaRepositorio;

    @InjectMocks
    private GestionDeRutasServicio gestionDeRutasServicio;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testConsultaDeCambiosEnLaRuta() {
        // Preparar datos de prueba
        String rutaId = "123";
        Ruta rutaEsperada = new Ruta(rutaId, "Cambios en la ruta A", "Recorrido de la ruta A", "Ruta diaria A");

        // Configurar comportamiento simulado del repositorio
        when(rutaRepositorio.consultarCambios(rutaId)).thenReturn(rutaEsperada);

        // Llamar al método a probar
        Ruta ruta = gestionDeRutasServicio.consultarCambiosEnLaRuta(rutaId);

        // Verificar los resultados
        assertEquals(rutaEsperada, ruta);
        verify(rutaRepositorio, times(1)).consultarCambios(rutaId);
    }

    @Test
    public void testVisualizacionDelRecorrido() {
        // Preparar datos de prueba
        String rutaId = "123";
        Ruta recorridoEsperado = new Ruta(rutaId, "Cambios en la ruta A", "Recorrido completo de estaciones", "Ruta diaria A");

        // Configurar comportamiento simulado del repositorio
        when(rutaRepositorio.visualizarRecorrido(rutaId)).thenReturn(recorridoEsperado);

        // Llamar al método a probar
        Ruta recorrido = gestionDeRutasServicio.visualizarRecorrido(rutaId);

        // Verificar los resultados
        assertEquals(recorridoEsperado, recorrido);
        verify(rutaRepositorio, times(1)).visualizarRecorrido(rutaId);
    }

    @Test
    public void testVisualizacionDeRutaDiaria() {
        // Preparar datos de prueba
        String rutaId = "123";
        Ruta rutaDiariaEsperada = new Ruta(rutaId, "Cambios en la ruta A", "Recorrido completo de estaciones", "Ruta diaria A");

        // Configurar comportamiento simulado del repositorio
        when(rutaRepositorio.visualizarRutaDiaria(rutaId)).thenReturn(rutaDiariaEsperada);

        // Llamar al método a probar
        Ruta rutaDiaria = gestionDeRutasServicio.visualizarRutaDiaria(rutaId);

        // Verificar los resultados
        assertEquals(rutaDiariaEsperada, rutaDiaria);
        verify(rutaRepositorio, times(1)).visualizarRutaDiaria(rutaId);
    }

}
