import java.time.LocalDate;
import java.util.List;

public abstract class Venta {

    private LocalDate fecha;
    private List<Item> items;

    public Venta(LocalDate fecha, List<Item> items) {
        this.fecha = fecha;
        this.items = items;
    }

    public Double getTotalVenta() {
        return this.getPrecioItems(items) + this.getRecargo(items);
    }

    protected Double getPrecioItems(List<Item> items) {
        return items.stream()
                .mapToDouble(Item::getPrecio)
                .sum();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public abstract Double getRecargo(List<Item> items);

}
