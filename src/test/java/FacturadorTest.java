import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturadorTest {

    @Test
    public void gananciasDeUnDeterminadoDia() {

        // Arrange
        LocalDate fecha = LocalDate.of(2023, 10, 1);
        Facturador facturador = new Facturador(getVentas());

        // Act
        Double totalFacturado = facturador.getTotalFacturado(fecha);

        // Assert
        assertEquals(1747.2, totalFacturado);
    }

    private List<Venta> getVentas() {
        return List.of(
                new VentaEnEfectivo(LocalDate.of(2023, 10, 1), getItems()),
                new VentaConTarjeta(LocalDate.of(2023, 10, 1), getItems(), 6),
                new VentaEnEfectivo(LocalDate.of(2023, 10, 2), getItems())
        );
    }

    private List<Item> getItems() {
        return List.of(
                new Item(getPrendaNueva(TipoPrenda.CAMISA, 100.0), 3),
                new Item(getPrendaEnPromocion(TipoPrenda.PANTALON, 100.0), 4),
                new Item(getPrendaEnLiquidacion(TipoPrenda.SACO, 100.0), 2)
        );
    }

    private Prenda getPrendaEnLiquidacion(TipoPrenda tipoPrenda, Double precioPropio) {
        return new Prenda(tipoPrenda, precioPropio, new Liquidacion());
    }

    private Prenda getPrendaEnPromocion(TipoPrenda tipoPrenda, Double precioPropio) {
        return new Prenda(tipoPrenda, precioPropio, new Promocion(20.0));
    }

    private Prenda getPrendaNueva(TipoPrenda tipoPrenda, Double precioPropio) {
        return new Prenda(tipoPrenda, precioPropio, new Nueva());
    }

}
