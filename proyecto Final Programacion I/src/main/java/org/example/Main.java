package org.example;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Parqueadero parqueadero = new Parqueadero("PARKUQ", "Universidad del Quindío");

        String usuario = JOptionPane.showInputDialog("Usuario:");

        String clave = JOptionPane.showInputDialog("Clave:");

        UsuarioSistema usuarioSistema = parqueadero.iniciarSesion(usuario, clave);

        if (usuarioSistema == null) {

            JOptionPane.showMessageDialog(null, "Datos incorrectos");

        } else {

            int opcion = 0;

            while (opcion != 5) {

                String texto = JOptionPane.showInputDialog(

                                "MENU\n\n"

                                        + "1. Registrar ingreso\n"

                                        + "2. Registrar salida\n"

                                        + "3. Ver vehiculos\n"

                                        + "4. Ver espacios\n"

                                        + "5. Salir");

                opcion = Integer.parseInt(texto);

                switch (opcion) {

                    case 1:

                        String placa = JOptionPane.showInputDialog("Placa:");

                        if (parqueadero.placaExiste(placa)) {

                            JOptionPane.showMessageDialog(null, "La placa ya existe");

                            break;
                        }

                        String nombre = JOptionPane.showInputDialog("Nombre conductor:");

                        String identificacion = JOptionPane.showInputDialog("Identificacion:");

                        int hora = Integer.parseInt(JOptionPane.showInputDialog("Hora ingreso:"));

                        String tipo = JOptionPane.showInputDialog(

                                        "Tipo Vehiculo\n"

                                                + "1. Carro\n"

                                                + "2. Motocicleta\n"

                                                + "3. Bicicleta");

                        Vehiculo vehiculo = null;

                        if (tipo.equals("1")) {

                            EspacioParqueadero espacio = parqueadero.buscarEspacioDisponible(TipoEspacio.CARRO);

                            if (espacio == null) {

                                JOptionPane.showMessageDialog(null, "No hay espacios");

                                break;
                            }

                            int puertas = Integer.parseInt(JOptionPane.showInputDialog("Numero puertas:"));

                            vehiculo = new Carro(placa, nombre, identificacion, hora, espacio.getCodigo(), puertas);

                        } else if (tipo.equals("2")) {

                            EspacioParqueadero espacio = parqueadero.buscarEspacioDisponible(TipoEspacio.MOTOCICLETA);

                            if (espacio == null) {

                                JOptionPane.showMessageDialog(null, "No hay espacios");

                                break;
                            }

                            int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Cilindraje:"));

                            vehiculo =new Motocicleta(placa, nombre, identificacion,hora, espacio.getCodigo(),cilindraje);

                        } else if (tipo.equals("3")) {

                            EspacioParqueadero espacio = parqueadero.buscarEspacioDisponible(TipoEspacio.BICICLETA);

                            if (espacio == null) {

                                JOptionPane.showMessageDialog(null, "No hay espacios");

                                break;
                            }

                            String numChassis = JOptionPane.showInputDialog("Numero chassis:");

                            vehiculo = new Bicicleta(placa, nombre, identificacion, hora, espacio.getCodigo());

                        } else {

                            JOptionPane.showMessageDialog(null, "Tipo invalido");

                            break;
                        }

                        parqueadero.registrarIngreso(vehiculo);

                        JOptionPane.showMessageDialog(null, "Vehiculo registrado");

                        break;

                    case 2:

                        String placaSalida = JOptionPane.showInputDialog("Placa:");

                        Vehiculo v = parqueadero.buscarVehiculo(placaSalida);

                        if (v == null) {

                            JOptionPane.showMessageDialog(null, "Vehiculo no encontrado");

                            break;
                        }

                        int horaSalida = Integer.parseInt(JOptionPane.showInputDialog("Hora salida:"));

                        double pago = parqueadero.calcularPago(v, horaSalida);

                        parqueadero.registrarSalida(placaSalida);

                        JOptionPane.showMessageDialog(null, "Pago total: " + pago);

                        break;

                    case 3:

                        JOptionPane.showMessageDialog(null, parqueadero.mostrarVehiculos());

                        break;

                    case 4:

                        JOptionPane.showMessageDialog(null,parqueadero.mostrarEspacios());

                        break;

                    case 5:

                        JOptionPane.showMessageDialog(null, "Sesion finalizada");

                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                }
            }
        }
    }
}