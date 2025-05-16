import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Domicilio domicilio;
    private Sucursal sucursal;
    private Factura factura;
    private HashSet<DetallePedido> detallePedido;

    public Pedido() {
    }

    public Pedido(LocalTime horaEstimadaFinalizacion, Double totalCosto, Estado estado, FormaPago formaPago, Sucursal sucursal, Domicilio domicilio, LocalDate fechaPedido, TipoEnvio tipoEnvio, Double total) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.formaPago = formaPago;
        this.sucursal = sucursal;
        this.domicilio = domicilio;
        this.fechaPedido = fechaPedido;
        this.tipoEnvio = tipoEnvio;
        this.total = total;
    }

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(Double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public HashSet<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(HashSet<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }

    public void agregarDetallePedido(DetallePedido detalle) {
        if (detallePedido == null) {
            detallePedido = new HashSet<>();
        }
        detallePedido.add(detalle);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", estado=" + estado +
                ", tipoEnvio=" + tipoEnvio +
                ", formaPago=" + formaPago +
                ", fechaPedido=" + fechaPedido +
                ", domicilio=" + domicilio +
                ", sucursal=" + sucursal +
                ", factura=" + factura +
                ", detallePedido=" + detallePedido +
                '}';
    }
}
