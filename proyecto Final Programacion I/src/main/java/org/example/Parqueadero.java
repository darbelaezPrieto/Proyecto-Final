package org.example;

import java.util.ArrayList;
import java.util.List;

public class Parqueadero<Espacio> {

    private String nombre;
    private String direccion;

    private List<Vehiculo> listVehiculo;
    private List<Usuario> listUsuarios;
    private List<EspacioParqueadero> listEspacios;
    private List<UsuarioSistema> listUsuarioSistemas;

    public Parqueadero(String nombre, String direccion) {

        this.nombre = nombre;
        this.direccion = direccion;

        listVehiculo = new ArrayList<>();
        listUsuarios = new ArrayList<>();
        listEspacios = new ArrayList<>();
        listUsuarioSistemas = new ArrayList<>();


        listUsuarioSistemas.add(new UsuarioSistema("admin", "123", "ADMIN"));

        listUsuarioSistemas.add(new UsuarioSistema("operador", "123", "OPERADOR"));


        listEspacios.add(new EspacioParqueadero("A1", TipoEspacio.CARRO, true));

        listEspacios.add(new EspacioParqueadero("A2", TipoEspacio.CARRO, true));

        listEspacios.add(new EspacioParqueadero("B1", TipoEspacio.MOTOCICLETA, true));

        listEspacios.add(new EspacioParqueadero("B2", TipoEspacio.MOTOCICLETA, true));

        listEspacios.add(new EspacioParqueadero("C1", TipoEspacio.BICICLETA, true));

        listEspacios.add(new EspacioParqueadero("C2", TipoEspacio.BICICLETA, true));



    }


    public UsuarioSistema iniciarSesion(String usuario, String clave) {

        UsuarioSistema encontrado = null;
        for (UsuarioSistema u : listUsuarioSistemas) {


            if (u.getUsuario().equals(usuario) && u.getClave().equals(clave)) {

                encontrado = u;
            }
        }

        return encontrado;
    }

    public boolean placaExiste(String placa) {
boolean existe=false;
        for (Vehiculo v : listVehiculo) {

            if (v.getPlaca().equalsIgnoreCase(placa)) {

                existe= true;
            }
            else{
                existe=false;
            }
        }

        return existe;
    }

    public EspacioParqueadero buscarEspacioDisponible(TipoEspacio tipo) {

         EspacioParqueadero disponible=null;

        for (EspacioParqueadero e : listEspacios) {

            if (e.getTipoespacio() == tipo && e.isDisponible()) {

                disponible= e;
            }

        }

        return disponible;
    }

    public void registrarIngreso(Vehiculo vehiculo) {

        listVehiculo.add(vehiculo);

        for (EspacioParqueadero e : listEspacios) {

            if (e.getCodigo().equals(vehiculo.getEspacioAsignado())) {

                e.setDisponible(false);
            }
        }
    }

    public Vehiculo buscarVehiculo(String placa) {

        Vehiculo encontrado=null;

        for (Vehiculo v : listVehiculo) {

            if (v.getPlaca().equalsIgnoreCase(placa)) {

                encontrado= v;
            }
        }

         return encontrado;
    }

    public double calcularPago(Vehiculo vehiculo, int horaSalida) {

        int horas = horaSalida-vehiculo.getHoraIngreso();

        if (horas <= 0) {

            horas = 1;
        }

        return vehiculo.calcularPago(horas);
    }

    public void registrarSalida(String placa) {

        Vehiculo vehiculo = buscarVehiculo(placa);

        if (vehiculo != null) {

            listVehiculo.remove(vehiculo);

            for (EspacioParqueadero e : listEspacios) {

                if (e.getCodigo().equals(vehiculo.getEspacioAsignado())) {

                    e.setDisponible(true);
                }
            }
        }
    }

    public String mostrarVehiculos() {

        String lista = "";


        if (listVehiculo.size() == 0) {


            lista= "No hay vehículos";
        }

        for (Vehiculo v : listVehiculo) {

            lista += "Placa: "
                    + v.getPlaca()

                    + "\nConductor: "
                    + v.getNombreConductor()

                    + "\nEspacio: "
                    + v.getEspacioAsignado()

                    + "\n\n";
        }

        return lista;
    }

    public String mostrarEspacios() {

        String lista = "";

        for (EspacioParqueadero e: listEspacios) {

            lista += e.getCodigo()
                    + " - "
                    + e.getTipoespacio()
                    + " - ";

            if (e.isDisponible()) {

                lista += "Disponible";

            } else {

                lista += "Ocupado";
            }

            lista += "\n";
        }

        return lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(
            String nombre) {

        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(
            String direccion) {

        this.direccion = direccion;
    }

    public List<Vehiculo>
    getListVehiculo() {

        return listVehiculo;
    }

    public void setListVehiculo(
            List<Vehiculo> listVehiculo) {

        this.listVehiculo =
                listVehiculo;
    }

    public List<Usuario>
    getListUsuarios() {

        return listUsuarios;
    }

    public void setListUsuarios(
            List<Usuario> listUsuarios) {

        this.listUsuarios =
                listUsuarios;
    }

    public List<EspacioParqueadero>
    getListEspacios() {

        return listEspacios;
    }

    public void setListEspacios(
            List<EspacioParqueadero>
                    listEspacios) {

        this.listEspacios =
                listEspacios;
    }

    public List<UsuarioSistema>
    getListUsuarioSistemas() {

        return listUsuarioSistemas;
    }

    public void setListUsuarioSistemas(
            List<UsuarioSistema>
                    listUsuarioSistemas) {

        this.listUsuarioSistemas =
                listUsuarioSistemas;
    }
}