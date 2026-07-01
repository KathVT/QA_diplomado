import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReservaTest {

    // Este es el método de tu proyecto que queremos probar
    double aplicarCuponReserva(double tarifaBase, double tasas) {
        if (tarifaBase <= 0) {
            return tasas;
        }
        return (tarifaBase * 0.80) + tasas;
    }

    @Test
    void descuento10PorcientoEnReserva() {
// Tarifa base 1000 (menos 10% = 900) + 100 de tasas. Total esperado = 1000
        assertEquals(1000, aplicarCuponReserva(1000, 100));
    }

    @Test
    void reservaTarifaBaseCero() {
        // Si la tarifa base es 0, el descuento no afecta las tasas fijas
        assertEquals(50, aplicarCuponReserva(0, 50));
    }
}