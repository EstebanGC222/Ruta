package org.example.GestionDePerfiles;

public interface PerfilRepositorio {

    Perfil calificarConductor(String perfilId);

    Perfil visualizarCalificacionPorConductor(String perfilId);

    Perfil seleccionarAsistenciaDiscapacidad(String perfilId);

    Perfil gestionarPerfil(String perfilId);

    Perfil darFeedbackServicio(String perfilId);
}

