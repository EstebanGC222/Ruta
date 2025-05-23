package org.example.GestionDeRutas;


public interface RutaRepositorio {

    Ruta consultarCambios(String rutaId);

    Ruta visualizarRecorrido(String rutaId);

    Ruta visualizarRutaDiaria(String rutaId);

    // Agregar más métodos según sea necesario
}
