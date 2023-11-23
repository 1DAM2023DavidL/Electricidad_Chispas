public class Sociedades extends Clientes {
    private String razonSocial;
    private String cif;

    public Sociedades(String codigoCliente, Integer direccionPostal, String poblacion, String provincia, String email, Integer telefono, String tipoCliente,String razonSocial, String cif) {
        super(codigoCliente,direccionPostal,poblacion,provincia,email,telefono,tipoCliente);
        this.razonSocial=razonSocial;
        this.cif=cif;
    }
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}