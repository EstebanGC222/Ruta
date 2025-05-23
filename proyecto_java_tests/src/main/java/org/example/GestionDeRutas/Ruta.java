package org.example.GestionDeRutas;

public class Ruta {
    private String id;
    private String cambios;
    private String recorrido;
    private String rutaDiaria;


    public Ruta(String id, String cambios, String recorrido, String rutaDiaria) {
        this.id = id;
        this.cambios = cambios;
        this.recorrido = recorrido;
        this.rutaDiaria = rutaDiaria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    public String getRutaDiaria() {
        return rutaDiaria;
    }

    public void setRutaDiaria(String rutaDiaria) {
        this.rutaDiaria = rutaDiaria;
    }
}
