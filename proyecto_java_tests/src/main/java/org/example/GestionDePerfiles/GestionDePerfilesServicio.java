package org.example.GestionDePerfiles;


public class GestionDePerfilesServicio {

    private final PerfilRepositorio perfilRepositorio;

    public GestionDePerfilesServicio(PerfilRepositorio perfilRepositorio) {
        this.perfilRepositorio = perfilRepositorio;
    }

    public Perfil calificarConductor(String perfilId) {
        return perfilRepositorio.calificarConductor(perfilId);
    }

    public Perfil visualizarCalificacionPorConductor(String perfilId) {
        return perfilRepositorio.visualizarCalificacionPorConductor(perfilId);
    }

    public Perfil seleccionarAsistenciaDiscapacidad(String perfilId) {
        return perfilRepositorio.seleccionarAsistenciaDiscapacidad(perfilId);
    }

    public Perfil gestionarPerfil(String perfilId) {
        return perfilRepositorio.gestionarPerfil(perfilId);
    }

    public Perfil darFeedbackServicio(String perfilId) {
        return perfilRepositorio.darFeedbackServicio(perfilId);
    }
}

