import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrendaTest {

    private Prenda prenda;

    @Test
    public void precioPrendaNueva() {
        prenda = new Prenda(TipoPrenda.CAMISA, 100.0, new Nueva());
        assertEquals(100.0, prenda.getPrecio());
    }

    @Test
    public void precioPrendaPromocion() {
        prenda = new Prenda(TipoPrenda.PANTALON, 100.0, new Promocion(20.0));
        assertEquals(80.0, prenda.getPrecio());
    }

    @Test
    public void precioPrendaLiquidacion() {
        prenda = new Prenda(TipoPrenda.SACO, 100.0, new Liquidacion());
        assertEquals(50.0, prenda.getPrecio());
    }

}
