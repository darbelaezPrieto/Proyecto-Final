package org.example;

public class Carro extends Vehiculo implements pagar {


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


    @Override
    public double calcularPago(int horas) {
        double totalCarro=0;

        totalCarro=horas*10000;
        return totalCarro;
    }
}
