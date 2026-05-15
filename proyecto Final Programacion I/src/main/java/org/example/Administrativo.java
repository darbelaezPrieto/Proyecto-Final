package org.example;

public class Administrativo  extends Usuario {


    private String carnetAdministrativo;

    public Administrativo(String nombre, String identificacion, String telefono, String carnetAdministrativo) {
        super(nombre, identificacion, telefono);
        this.carnetAdministrativo = carnetAdministrativo;
    }

    public String getCarnetAdministrativo() {
        return carnetAdministrativo;
    }

    public void setCarnetAdministrativo(String carnetAdministrativo) {
        this.carnetAdministrativo = carnetAdministrativo;
    }


}
