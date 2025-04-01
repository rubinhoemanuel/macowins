import java.time.LocalDate;
import java.util.List;

public class VentaConTarjeta extends Venta {

    private Integer cantidadCuotas;
    private static final Double COEFICIENTE_FIJO = 50.0;
    private static final Double PORCENTAJE_X_PRENDA = 0.01;

    public VentaConTarjeta(LocalDate fecha, List<Item> items, Integer cantidadCuotas) {
        super(fecha, items);
        this.cantidadCuotas = cantidadCuotas;
    }

    @Override
    public Double getRecargo(List<Item> items) {
        return this.cantidadCuotas * COEFICIENTE_FIJO + PORCENTAJE_X_PRENDA * super.getPrecioItems(items);
    }
}
