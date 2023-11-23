import java.util.ArrayList;

public class Facturas {
    private String codigoFactura;
    private String fechaFactura;
    private String baseImponible;
    private String total;
    private Clientes clientes;
    private ArrayList<Productos> productos;
    private ArrayList<Servicios> servicios;

    public Facturas (String codigoFactura, String fechaFactura, String baseImponible, String total) {
        this.codigoFactura= codigoFactura;
        this.fechaFactura=fechaFactura;
        this.baseImponible=baseImponible;
        this.total=total;
    }
    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(String baseImponible) {
        this.baseImponible = baseImponible;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public ArrayList<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicios> servicios) {
        this.servicios = servicios;
    }
}
