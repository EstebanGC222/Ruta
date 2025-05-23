package org.example.GestionDeViajes;

public class Viaje {
    private String id;
    private String tiempoLlegada;
    private String tiempoEstimado;
    private String tiempoFinalizacion;
    private String tiempoEntreEstaciones;
    private String historial;
    private String tarifa;


    public Viaje(String id, String tiempoLlegada, String tiempoEstimado, String tiempoFinalizacion, String tiempoEntreEstaciones, String historial, String tarifa) {
        this.id = id;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoEstimado = tiempoEstimado;
        this.tiempoFinalizacion = tiempoFinalizacion;
        this.tiempoEntreEstaciones = tiempoEntreEstaciones;
        this.historial = historial;
        this.tarifa = tarifa;
    }

}