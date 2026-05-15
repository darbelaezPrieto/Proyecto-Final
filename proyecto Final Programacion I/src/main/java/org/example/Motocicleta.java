package org.example;

public class Motocicleta extends Vehiculo {




    private int cilindraje;

    public Motocicleta(String placa, String nombreConductor, String identificacionConductor, int horaIngreso, String espacioAsignado, int cilindraje) {
        super(placa, nombreConductor, identificacionConductor, horaIngreso, espacioAsignado);
        this.cilindraje = cilindraje;
    }
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

}

