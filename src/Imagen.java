public class Imagen {
    private String denominacion;

    public Imagen() {
    }

    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}
