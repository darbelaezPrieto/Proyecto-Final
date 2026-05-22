package org.example;

public class Motocicleta extends Vehiculo implements pagar {




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

    @Override
    public double calcularPago(int horas) {
        double totalMoto=0;

        totalMoto=horas*5000;
        return totalMoto;
    }
}

