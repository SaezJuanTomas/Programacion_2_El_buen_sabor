import java.util.HashSet;

public class Empresa {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private HashSet<Sucursal> sucursales;

    public Empresa() {
    }

    public Empresa(String nombre, String razonSocial, Integer cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }

    public HashSet<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(HashSet<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void agregarSucursal(Sucursal sucursal) {
        if (sucursales == null) {
            sucursales = new HashSet<>();
        }
        sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuil=" + cuil +
                ", sucursales=" + sucursales +
                '}';
    }
}
