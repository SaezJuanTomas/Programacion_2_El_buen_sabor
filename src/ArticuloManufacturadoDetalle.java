public class ArticuloManufacturadoDetalle {
    private Integer cantidad;
    private ArtuculoInsumo articuloInsumo;

    public ArticuloManufacturadoDetalle() {
    }

    public ArticuloManufacturadoDetalle(Integer cantidad, ArtuculoInsumo articuloInsumo) {
        this.cantidad = cantidad;
        this.articuloInsumo = articuloInsumo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ArtuculoInsumo getArticuloInsumo() {
        return articuloInsumo;
    }

    public void setArticuloInsumo(ArtuculoInsumo articuloInsumo) {
        this.articuloInsumo = articuloInsumo;
    }

    @Override
    public String toString() {
        return "ArticuloManufacturadoDetalle{" +
                "cantidad=" + cantidad +
                ", articuloInsumo=" + articuloInsumo +
                '}';
    }
}
