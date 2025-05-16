import java.time.LocalTime;
import java.util.HashSet;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private HashSet<Categoria> categorias;
    private HashSet<Promocion> promociones;

    public Sucursal() {
    }

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
        this.categorias = new HashSet<>();
        this.promociones = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public HashSet<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(HashSet<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void agregarCategoria(Categoria categoria) {
        if (categorias == null) {
            categorias = new HashSet<>();
        }
        categorias.add(categoria);
    }

    public HashSet<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(HashSet<Promocion> promociones) {
        this.promociones = promociones;
    }

    public void agregarPromocion(Promocion promocion) {
        if (promociones == null) {
            promociones = new HashSet<>();
        }
        promociones.add(promocion);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", domicilio=" + domicilio +
                ", categorias=" + categorias +
                ", promociones=" + promociones +
                '}';
    }
}
