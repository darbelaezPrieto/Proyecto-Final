package org.example;

public class Visitante  extends  Usuario{



    private String permisoVisitante;


    public Visitante(String nombre, String identificacion, String telefono, String permisoVisitante) {
        super(nombre, identificacion, telefono);
        this.permisoVisitante = permisoVisitante;
    }


    public String getPermisoVisitante() {
        return permisoVisitante;
    }

    public void setPermisoVisitante(String permisoVisitante) {
        this.permisoVisitante = permisoVisitante;
    }
}
