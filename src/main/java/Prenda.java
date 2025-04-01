public class Prenda {

    private TipoPrenda tipo;
    private EstadoPrenda estado;
    private Double precioPropio;

    public Prenda(TipoPrenda tipo, Double precioPropio, EstadoPrenda estado) {
        this.tipo = tipo;
        this.precioPropio = precioPropio;
        this.estado = estado;
    }

    public Double getPrecio() {
        return estado.calcularPrecio(precioPropio);
    }

}
