import java.util.HashSet;

public class Articulo {
    private String denominacion;
    private Double precioVenta;
    private UnidadMedida unidadMedida;
    private HashSet<Imagen> imagenes;

    public Articulo() {
    }

    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public HashSet<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(HashSet<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public void agregarImagen(Imagen imagen) {
        if (imagenes == null) {
            imagenes = new HashSet<>();
        }
        imagenes.add(imagen);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", unidadMedida=" + unidadMedida +
                ", imagenes=" + imagenes +
                '}';
    }
}
