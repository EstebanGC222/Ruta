
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.example.GestionDePerfiles.GestionDePerfilesServicio;
import org.example.GestionDePerfiles.Perfil;
import org.example.GestionDePerfiles.PerfilRepositorio;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GestionDePerfilesTest {

    @Mock
    private PerfilRepositorio perfilRepositorio;

    @InjectMocks
    private GestionDePerfilesServicio gestionDePerfilesServicio;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalificarConductor() {
        // Preparar datos de prueba
        String perfilId = "123";
        Perfil perfilEsperado = new Perfil(perfilId, "5 estrellas", "4 estrellas", true, "gestión perfil", "buen servicio");

        // Configurar comportamiento simulado del repositorio
        when(perfilRepositorio.calificarConductor(perfilId)).thenReturn(perfilEsperado);

        // Llamar al método a probar
        Perfil perfil = gestionDePerfilesServicio.calificarConductor(perfilId);

        // Verificar los resultados
        assertEquals(perfilEsperado, perfil);
        verify(perfilRepositorio, times(1)).calificarConductor(perfilId);
    }

    @Test
    public void testVisualizarCalificacionPorConductor() {
        // Preparar datos de prueba
        String perfilId = "123";
        Perfil perfilEsperado = new Perfil(perfilId, "5 estrellas", "4 estrellas", true, "gestión perfil", "buen servicio");

        // Configurar comportamiento simulado del repositorio
        when(perfilRepositorio.visualizarCalificacionPorConductor(perfilId)).thenReturn(perfilEsperado);

        // Llamar al método a probar
        Perfil perfil = gestionDePerfilesServicio.visualizarCalificacionPorConductor(perfilId);

        // Verificar los resultados
        assertEquals(perfilEsperado, perfil);
        verify(perfilRepositorio, times(1)).visualizarCalificacionPorConductor(perfilId);
    }

    @Test
    public void testSeleccionarAsistenciaDiscapacidad() {
        // Preparar datos de prueba
        String perfilId = "123";
        Perfil perfilEsperado = new Perfil(perfilId, "5 estrellas", "4 estrellas", true, "gestión perfil", "buen servicio");

        // Configurar comportamiento simulado del repositorio
        when(perfilRepositorio.seleccionarAsistenciaDiscapacidad(perfilId)).thenReturn(perfilEsperado);

        // Llamar al método a probar
        Perfil perfil = gestionDePerfilesServicio.seleccionarAsistenciaDiscapacidad(perfilId);

        // Verificar los resultados
        assertEquals(perfilEsperado, perfil);
        verify(perfilRepositorio, times(1)).seleccionarAsistenciaDiscapacidad(perfilId);
    }

    @Test
    public void testGestionarPerfil() {
        // Preparar datos de prueba
        String perfilId = "123";
        Perfil perfilEsperado = new Perfil(perfilId, "5 estrellas", "4 estrellas", true, "gestión perfil", "buen servicio");

        // Configurar comportamiento simulado del repositorio
        when(perfilRepositorio.gestionarPerfil(perfilId)).thenReturn(perfilEsperado);

        // Llamar al método a probar
        Perfil perfil = gestionDePerfilesServicio.gestionarPerfil(perfilId);

        // Verificar los resultados
        assertEquals(perfilEsperado, perfil);
        verify(perfilRepositorio, times(1)).gestionarPerfil(perfilId);
    }

    @Test
    public void testDarFeedbackServicio() {
        // Preparar datos de prueba
        String perfilId = "123";
        Perfil perfilEsperado = new Perfil(perfilId, "5 estrellas", "4 estrellas", true, "gestión perfil", "buen servicio");

        // Configurar comportamiento simulado del repositorio
        when(perfilRepositorio.darFeedbackServicio(perfilId)).thenReturn(perfilEsperado);

        // Llamar al método a probar
        Perfil perfil = gestionDePerfilesServicio.darFeedbackServicio(perfilId);

        // Verificar los resultados
        assertEquals(perfilEsperado, perfil);
        verify(perfilRepositorio, times(1)).darFeedbackServicio(perfilId);
    }
}
