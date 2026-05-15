package org.example;

public class Carro extends Vehiculo {


    private int numeroPuertas;


    public Carro(String placa, String nombreConductor, String identificacionConductor, int horaIngreso, String espacioAsignado, int numeroPuertas) {
        super(placa, nombreConductor, identificacionConductor, horaIngreso, espacioAsignado);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }


}
