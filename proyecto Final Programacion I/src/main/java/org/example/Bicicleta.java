package org.example;

public class Bicicleta  extends  Vehiculo {



    private String numChassis;


    public Bicicleta(String placa, String nombreConductor, String identificacionConductor, int horaIngreso, String espacioAsignado, String numChassis) {
        super(placa, nombreConductor, identificacionConductor, horaIngreso, espacioAsignado);
        this.numChassis = numChassis;
    }



    public String getNumChassis() {
        return numChassis;
    }

    public void setNumChassis(String numChassis) {
        this.numChassis = numChassis;
    }
}