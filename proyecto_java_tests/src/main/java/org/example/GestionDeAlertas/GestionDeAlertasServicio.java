package org.example.GestionDeAlertas;

public class GestionDeAlertasServicio {

    private final AlertaRepositorio alertaRepositorio;

    public GestionDeAlertasServicio(AlertaRepositorio alertaRepositorio) {
        this.alertaRepositorio = alertaRepositorio;
    }

    public Alerta notificarRetrasos(String alertaId) {
        return alertaRepositorio.notificarRetrasos(alertaId);
    }

    public Alerta alertarMantenimiento(String alertaId) {
        return alertaRepositorio.alertarMantenimiento(alertaId);
    }

    public Alerta reportarProblemasEnRuta(String alertaId) {
        return alertaRepositorio.reportarProblemasEnRuta(alertaId);
    }

    public Alerta alertarTrafico(String alertaId) {
        return alertaRepositorio.alertarTrafico(alertaId);
    }
}
