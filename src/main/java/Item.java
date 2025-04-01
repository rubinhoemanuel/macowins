public class Item {

    public Prenda prenda;
    public int cantidad;

    public Item(Prenda prenda, int cantidad) {
        this.prenda = prenda;
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return prenda.getPrecio() * cantidad;
    }

}
