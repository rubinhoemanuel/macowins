public class Liquidacion implements EstadoPrenda {

    private static final Double PORCENTAJE_LIQUIDACION = 50.0;

    @Override
    public Double calcularPrecio(Double precioPropio) {
        return precioPropio - (precioPropio * (PORCENTAJE_LIQUIDACION / 100));
    }

}
