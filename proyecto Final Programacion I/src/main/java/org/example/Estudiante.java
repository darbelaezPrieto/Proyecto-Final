package org.example;

public class Estudiante extends Usuario{



    private  String carnetEstudiantil;

    public Estudiante(String nombre, String identificacion, String telefono, String carnetEstudiantil) {
        super(nombre, identificacion, telefono);
        this.carnetEstudiantil = carnetEstudiantil;
    }


    public String getCarnetEstudiantil() {
        return carnetEstudiantil;
    }

    public void setCarnetEstudiantil(String carnetEstudiantil) {
        this.carnetEstudiantil = carnetEstudiantil;
    }
}
