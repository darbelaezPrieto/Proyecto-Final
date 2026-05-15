package org.example;

public class Docente  extends Usuario {

    private String carnetDocente;


    public Docente(String nombre, String identificacion, String telefono, String carnetDocente) {
        super(nombre, identificacion, telefono);
        this.carnetDocente = carnetDocente;
    }
    public String getCarnetDocente() {
        return carnetDocente;
    }

    public void setCarnetDocente(String carnetDocente) {
        this.carnetDocente = carnetDocente;
    }

}
