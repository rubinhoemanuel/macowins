import java.time.LocalDate;
import java.util.List;

public class VentaEnEfectivo extends Venta {

    public VentaEnEfectivo(LocalDate fecha, List<Item> items) {
        super(fecha, items);
    }

    @Override
    public Double getRecargo(List<Item> items) {
        return 0.0;
    }
}
