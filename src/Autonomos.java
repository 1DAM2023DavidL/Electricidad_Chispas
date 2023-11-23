//hola
public class Autonomos extends Clientes {
    private String nombre;
    private String apellidos;
    private String dni;

    public Autonomos(String codigoCliente, Integer direccionPostal, String poblacion, String provincia, String email, Integer telefono, String tipoCliente, String nombre, String apellidos, String dni) {
        super(codigoCliente,direccionPostal,poblacion,provincia,email,telefono,tipoCliente);
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
