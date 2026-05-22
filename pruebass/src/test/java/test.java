
import org.example.Usuario;
// ESTOS IMPORTS SON OBLIGATORIOS PARA QUE JUNIT FUNCIONE:
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestUsuario {

    @Test
    public void palindromo() {
        Usuario usuario = new Usuario("ana", "717");
        assertTrue(usuario.palindromo(usuario.getNombre()));
    }
}
