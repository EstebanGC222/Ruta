package org.example.GestionDeViajes;



public interface ViajeRepositorio {

    Viaje obtenerTiempoLlegada(String viajeId);

    Viaje estimarTiempoDeViaje(String viajeId);

    Viaje estimarTiempoDeFinalizacion(String viajeId);

    Viaje estimarTiempoEntreEstaciones(String viajeId);

    Viaje obtenerHistorialDeViajes(String clienteId);

    Viaje obtenerInformacionDeTarifas(String viajeId);
}
