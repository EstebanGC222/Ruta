package org.example.GestionDeAlertas;

public interface AlertaRepositorio {

    Alerta notificarRetrasos(String alertaId);

    Alerta alertarMantenimiento(String alertaId);

    Alerta reportarProblemasEnRuta(String alertaId);

    Alerta alertarTrafico(String alertaId);
}

