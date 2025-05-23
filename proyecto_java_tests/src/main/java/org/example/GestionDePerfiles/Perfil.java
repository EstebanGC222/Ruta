package org.example.GestionDePerfiles;


public class Perfil {
    private String id;
    private String calificacionConductor;
    private String calificacionPorConductor;
    private boolean asistenciaDiscapacidad;
    private String gestionPerfil;
    private String feedbackServicio;


    public Perfil(String id, String calificacionConductor, String calificacionPorConductor, boolean asistenciaDiscapacidad, String gestionPerfil, String feedbackServicio) {
        this.id = id;
        this.calificacionConductor = calificacionConductor;
        this.calificacionPorConductor = calificacionPorConductor;
        this.asistenciaDiscapacidad = asistenciaDiscapacidad;
        this.gestionPerfil = gestionPerfil;
        this.feedbackServicio = feedbackServicio;
    }

}

