import com.sun.source.tree.NewArrayTree;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.OptionalInt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Domicilio domicilio1 = new Domicilio("Montevideo", 123, 1234, new Localidad("Ciudad", new Provincia("Mendoza", new Pais("Argentina"))));
        LocalTime horarioApertura = LocalTime.of(10, 0);
        LocalTime horarioCierre = LocalTime.of(20, 0);
        Sucursal sucursal1 = new Sucursal("Sucursal 1", horarioApertura, horarioCierre, domicilio1);
        sucursal1.agregarCategoria(new Categoria("Comida 1"));

        Domicilio domicilio2 = new Domicilio("Aristides", 125, 1234, new Localidad("Ciudad", new Provincia("Mendoza", new Pais("Argentina"))));
        Sucursal sucursal2 = new Sucursal("Sucursal 1", horarioApertura, horarioCierre, domicilio1);
        sucursal2.agregarCategoria(new Categoria("Comida 2"));

        Empresa empresa1 = new Empresa("El buen sabor srl", "Razon social 1", 123456789);
        empresa1.agregarSucursal(sucursal1);
        empresa1.agregarSucursal(sucursal2);

        Usuario usuario1 = new Usuario("123", "JuanSaez");
        Imagen imagen1 = new Imagen("https://example.com/image.jpg");
        Cliente cliente1 = new Cliente("Juan", "Saez", "2613639999", "Saezjuan@gmail.com", LocalDate.of(1990, 1, 1), usuario1, imagen1);

        Usuario usuario2 = new Usuario("125", "Tomas");
        Cliente cliente2 = new Cliente("Tomas", "Olivera", "2613639999", "Tomasolivera@gmail.com", LocalDate.of(1990, 1, 1), usuario1, imagen1);

        ArtuculoInsumo articuloInsumo1 = new ArtuculoInsumo("Pan", 100.0, new UnidadMedida("kg"), 20.0, 200, 200, true);
        ArtuculoInsumo articuloInsumo2 = new ArtuculoInsumo("Carne", 100.0, new UnidadMedida("kg"), 50.0, 100, 200, true);

        ArticuloManufacturado articuloManufacturado1 = new ArticuloManufacturado("Hamburguesa", 500.0, new UnidadMedida("Comida"),"Hamburguesa simple", 20, "Receta hamburguesa");
        articuloManufacturado1.agregarArticuloManufacturadoDetalle(new ArticuloManufacturadoDetalle(1, articuloInsumo2));

        ArticuloManufacturado articuloManufacturado2 = new ArticuloManufacturado("Hamburguesa doble", 600.0, new UnidadMedida("Comida"),"Hamburguesa doble", 25, "Receta hamburguesa 2");
        articuloManufacturado2.agregarArticuloManufacturadoDetalle(new ArticuloManufacturadoDetalle(2, articuloInsumo2));


        LocalDate fechaDesde = LocalDate.of(2025, 10, 1);
        LocalDate fechaHasta = LocalDate.of(2025, 10, 31);
        LocalTime horaDesde = LocalTime.of(10, 0);
        LocalTime horaHasta = LocalTime.of(20, 0);

        Promocion promocion1 =  new Promocion("Promo 2x1", fechaDesde, fechaHasta, horaDesde, horaHasta, "2x1 Hamburguesa doble", 1000.00, TipoPromocion.PROMOCION);
        promocion1.agregarArticulo(articuloManufacturado2);
        promocion1.agregarArticulo(articuloManufacturado2);
        promocion1.agregarImagen(imagen1);
        sucursal1.agregarPromocion(promocion1);
        sucursal2.agregarPromocion(promocion1);

        Pedido pedido1 = new Pedido(LocalTime.of(12, 0), 1000.0, Estado.PENDIENTE, FormaPago.EFECTIVO, sucursal1, domicilio1, LocalDate.of(2025, 10, 1), TipoEnvio.DELIVERY, 1000.0);
        cliente1.agregarPedido(pedido1);
        pedido1.agregarDetallePedido(new DetallePedido(1,1000.0, articuloManufacturado1));
        pedido1.setFactura(new Factura(LocalDate.of(2025, 10, 1), 123456, 123456, "123456", "CREDIT_CARD", FormaPago.MERCADO_PAGO, 1000.0));

        System.out.println(empresa1);
        System.out.println("--------------------");
        System.out.println(cliente1);

    }

}