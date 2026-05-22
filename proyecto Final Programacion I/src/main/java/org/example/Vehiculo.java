package org.example;

public  abstract class Vehiculo implements pagar {

    private String placa;
    private String nombreConductor;
    private String IdentificacionConductor;
    private int horaIngreso;
    private String espacioAsignado;



    public Vehiculo(String placa, String nombreConductor, String identificacionConductor, int horaIngreso, String espacioAsignado) {

        this.placa = placa;
        this.nombreConductor = nombreConductor;
        IdentificacionConductor = identificacionConductor;
        this.horaIngreso = horaIngreso;
        this.espacioAsignado = espacioAsignado;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getIdentificacionConductor() {
        return IdentificacionConductor;
    }

    public void setIdentificacionConductor(String identificacionConductor) {
        IdentificacionConductor = identificacionConductor;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getEspacioAsignado() {
        return espacioAsignado;
    }

    public void setEspacioAsignado(String espacioAsignado) {
        this.espacioAsignado = espacioAsignado;
    }
}
