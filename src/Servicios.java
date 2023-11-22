public class Servicios extends Trabajo {
    private String codigoServicios;

    public Servicios(String codigoTrabajo, String nombre, String precio, String tipoIva, String tipoTrabajo, String codigoServicios) {
        super (codigoTrabajo,nombre,precio,tipoIva,tipoTrabajo);
        this.codigoServicios=codigoServicios;
    }
    public String getCodigoServicios() {
        return codigoServicios;
    }

    public void setCodigoServicios(String codigoServicios) {
        this.codigoServicios = codigoServicios;
    }
}