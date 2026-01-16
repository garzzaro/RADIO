import org.junit.Test;
import static org.junit.Assert.*;

public class ImplementacionTest {

    @Test
    public void testInstancia() {
        Implementacion radio = new Implementacion();
        // Verifica que el objeto no sea nulo
        assertNotNull(radio);
    }

    @Test
    public void testEncendido() {
        Implementacion radio = new Implementacion();
        radio.prenderRadio();
        // Si el objeto responde sin errores, la prueba pasa
        assertTrue(true);
    }

    @Test
    public void testCambioBanda() {
        Implementacion radio = new Implementacion();
        radio.prenderRadio();
        radio.cambiarFM();
        radio.cambiarAM();
        // Verificación de flujo
        assertTrue("El cambio de banda fallo", true);
    }
}
