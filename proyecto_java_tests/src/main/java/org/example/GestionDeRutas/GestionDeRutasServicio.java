package org.example.GestionDeRutas;



public class GestionDeRutasServicio {

    private final RutaRepositorio rutaRepositorio;

    public GestionDeRutasServicio(RutaRepositorio rutaRepositorio) {
        this.rutaRepositorio = rutaRepositorio;
    }

    public Ruta consultarCambiosEnLaRuta(String rutaId) {
        return rutaRepositorio.consultarCambios(rutaId);
    }

    public Ruta visualizarRecorrido(String rutaId) {
        return rutaRepositorio.visualizarRecorrido(rutaId);
    }

    public Ruta visualizarRutaDiaria(String rutaId) {
        return rutaRepositorio.visualizarRutaDiaria(rutaId);
    }

}
