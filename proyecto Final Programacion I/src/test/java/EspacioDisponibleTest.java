import org.example.EspacioParqueadero;
import org.example.Parqueadero;
import org.example.TipoEspacio;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class EspacioDisponibleTest {

    @Test
    public void buscarEspacioDisponible() {

        Parqueadero parqueadero = new Parqueadero("PARKUQ", "UQ");

        EspacioParqueadero espacio = parqueadero.buscarEspacioDisponible(TipoEspacio.CARRO);

        assertNotNull(espacio);
    }
}

