package org.example.GestionDeAlertas;

public class Alerta {
    private String id;
    private String retrasos;
    private String mantenimiento;
    private String problemasRuta;
    private String trafico;


    public Alerta(String id, String retrasos, String mantenimiento, String problemasRuta, String trafico) {
        this.id = id;
        this.retrasos = retrasos;
        this.mantenimiento = mantenimiento;
        this.problemasRuta = problemasRuta;
        this.trafico = trafico;
    }

}
