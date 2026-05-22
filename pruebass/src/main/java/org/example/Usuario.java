package org.example;

public class Usuario {

    private  String nombre;
    private String identificacion;



    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }


    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public boolean palindromo (String  nombre){

        int inicio=0;
        int fin=nombre.length()-1;
        boolean espalindromo=false;

        while(inicio<fin){

            if(nombre.charAt(inicio)!=nombre.charAt(fin)){

                espalindromo=false;
            }
            else{
                espalindromo=true;
            }
            inicio++;
            fin--;
        }
        return espalindromo;

    }

}
