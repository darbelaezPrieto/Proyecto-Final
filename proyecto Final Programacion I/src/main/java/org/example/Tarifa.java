package org.example;

public class Tarifa {

    private double valorPorHora;



    private  double descuento;

    public Tarifa(double descuento, double valorPorHora) {
        this.descuento = descuento;
        this.valorPorHora = valorPorHora;
    }
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
