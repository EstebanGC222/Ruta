package org.example.GestionDeViajes;



public class GestionDeViajesServicio {

    private final ViajeRepositorio viajeRepositorio;

    public GestionDeViajesServicio(ViajeRepositorio viajeRepositorio) {
        this.viajeRepositorio = viajeRepositorio;
    }

    public Viaje obtenerTiempoLlegada(String viajeId) {
        return viajeRepositorio.obtenerTiempoLlegada(viajeId);
    }

    public Viaje estimarTiempoDeViaje(String viajeId) {
        return viajeRepositorio.estimarTiempoDeViaje(viajeId);
    }

    public Viaje estimarTiempoDeFinalizacion(String viajeId) {
        return viajeRepositorio.estimarTiempoDeFinalizacion(viajeId);
    }

    public Viaje estimarTiempoEntreEstaciones(String viajeId) {
        return viajeRepositorio.estimarTiempoEntreEstaciones(viajeId);
    }

    public Viaje obtenerHistorialDeViajes(String clienteId) {
        return viajeRepositorio.obtenerHistorialDeViajes(clienteId);
    }

    public Viaje obtenerInformacionDeTarifas(String viajeId) {
        return viajeRepositorio.obtenerInformacionDeTarifas(viajeId);
    }
}
