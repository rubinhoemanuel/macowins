public class Item {

    private Prenda prenda;
    private Integer cantidad;

    public Item(Prenda prenda, Integer cantidad) {
        this.prenda = prenda;
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return prenda.getPrecio() * cantidad;
    }

}
