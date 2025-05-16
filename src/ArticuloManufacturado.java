import java.util.HashSet;

public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private HashSet<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;

    public ArticuloManufacturado() {
    }

    public ArticuloManufacturado(String denominacion, Double precioVenta, UnidadMedida unidadMedida, String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta, unidadMedida);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public HashSet<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalles() {
        return articuloManufacturadoDetalles;
    }

    public void setArticuloManufacturadoDetalles(HashSet<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles) {
        this.articuloManufacturadoDetalles = articuloManufacturadoDetalles;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle){
        if (articuloManufacturadoDetalles == null) {
            articuloManufacturadoDetalles = new HashSet<>();
        }
        articuloManufacturadoDetalles.add(articuloManufacturadoDetalle);
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "denominacion='" + getDenominacion() + '\'' +
                ", precioVenta=" + getPrecioVenta() +
                ", unidadMedida=" + getUnidadMedida() +
                ", descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                '}';
    }
}
