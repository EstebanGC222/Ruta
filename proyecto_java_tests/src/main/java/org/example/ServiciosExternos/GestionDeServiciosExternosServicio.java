package org.example.ServiciosExternos;


public class GestionDeServiciosExternosServicio {

    private final ServicioExternoRepositorio servicioExternoRepositorio;

    public GestionDeServiciosExternosServicio(ServicioExternoRepositorio servicioExternoRepositorio) {
        this.servicioExternoRepositorio = servicioExternoRepositorio;
    }

    public ServicioExterno monitorearCondicionesClimaticas(String servicioId) {
        return servicioExternoRepositorio.monitorearCondicionesClimaticas(servicioId);
    }

    public ServicioExterno soporteMultilenguaje(String servicioId) {
        return servicioExternoRepositorio.soporteMultilenguaje(servicioId);
    }
}
