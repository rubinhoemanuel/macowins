import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VentaTest {

    @Test
    public void precioVentaEnEfectivo() {

        // Arrange
        LocalDate fecha = LocalDate.of(2023, 10, 1);
        VentaEnEfectivo venta = getVentaEnEfectivo(fecha);

        // Act
        Double precioTotal = venta.getTotalVenta();

        // Assert
        assertEquals(720.0, precioTotal);
    }

    public VentaEnEfectivo getVentaEnEfectivo(LocalDate fecha) {
        return new VentaEnEfectivo(fecha, getItems());
    }

    @Test
    public void precioVentaConTarjeta() {

        // Arrange
        LocalDate fecha = LocalDate.of(2023, 10, 1);
        VentaConTarjeta venta = getVentaConTarjeta(fecha,6); //

        // Act
        Double precioTotal = venta.getTotalVenta();

        // Assert
        assertEquals(1027.2, precioTotal);
    }

    private VentaConTarjeta getVentaConTarjeta(LocalDate fecha, Integer i) {
        return new VentaConTarjeta(fecha, getItems(), 6);
    }

    private List<Item> getItems() {
        return List.of(
                new Item(this.getPrendaNueva(TipoPrenda.CAMISA, 100.0), 3),
                new Item(getPrendaEnPromocion(TipoPrenda.PANTALON, 100.0), 4),
                new Item(getPrendaEnLiquidacion(TipoPrenda.SACO, 100.0), 2)
        );
    }

    private Prenda getPrendaNueva(TipoPrenda tipo, Double precioPropio) {
        return new Prenda(tipo, precioPropio, new Nueva());
    }

    private Prenda getPrendaEnPromocion(TipoPrenda tipo, Double precioPropio) {
        return new Prenda(tipo, precioPropio, new Promocion( 20.0));
    }

    private Prenda getPrendaEnLiquidacion(TipoPrenda tipo, Double precioPropio) {
        return new Prenda(tipo, precioPropio, new Liquidacion());
    }

}
