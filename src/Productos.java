public class Productos extends Trabajo{
    private String codigoProducto;
    private String marca;
    private String modelo;

    public Productos(String codigoTrabajo, String nombre, String precio, String tipoIva, String tipoTrabajo, String codigoProducto, String marca, String modelo) {
        super (codigoTrabajo,nombre,precio,tipoIva,tipoTrabajo);
        this.modelo=modelo;
        this.marca=marca;
        this.codigoProducto=codigoProducto;
    }
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}