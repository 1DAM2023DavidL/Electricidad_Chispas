import java.util.ArrayList;

public class Clientes {
    private String codigoCliente;
    private Integer direccionPostal;
    private String poblacion;
    private String provincia;
    private String email;
    private Integer telefono;
    private String tipoCliente;

    public Clientes(String codigoCliente, Integer direccionPostal, String poblacion, String provincia, String email, Integer telefono, String tipoCliente) {
        this.codigoCliente=codigoCliente;
        this.direccionPostal=direccionPostal;
        this.poblacion=poblacion;
        this.provincia=provincia;
        this.email=email;
        this.telefono=telefono;
        this.tipoCliente=tipoCliente;
    }
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Integer getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(Integer direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
