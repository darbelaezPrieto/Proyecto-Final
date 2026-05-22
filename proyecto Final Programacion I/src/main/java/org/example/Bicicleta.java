package org.example;

public class Bicicleta  extends  Vehiculo implements pagar {



    private String numChassis;


    public Bicicleta(String placa, String nombreConductor, String identificacionConductor, int horaIngreso, String espacioAsignado) {
        super(placa, nombreConductor, identificacionConductor, horaIngreso, espacioAsignado);
        this.numChassis = numChassis;
    }



    public String getNumChassis() {
        return numChassis;
    }

    public void setNumChassis(String numChassis) {
        this.numChassis = numChassis;
    }

    @Override
    public double calcularPago(int horas) {

        double totalBicicleta=0;


        totalBicicleta=horas*2000;
        return totalBicicleta;

    }
}