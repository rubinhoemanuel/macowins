public class Promocion implements EstadoPrenda {

    private Double valorFijo;

    public Promocion(Double valorFijo) {
        this.valorFijo = valorFijo;
    }

    @Override
    public Double calcularPrecio(Double precioPropio) {
        return precioPropio - valorFijo;
    }
}
