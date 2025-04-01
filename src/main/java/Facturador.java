import java.time.LocalDate;
import java.util.List;

public class Facturador {

    List<Venta> ventas;

    public Facturador(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Double getTotalFacturado(LocalDate fecha) {
        return this.ventas.stream()
                .filter(venta -> venta.getFecha().equals(fecha))
                .mapToDouble(Venta::getTotalVenta)
                .sum();
    }

}
