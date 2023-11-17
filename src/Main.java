import java.net.StandardSocketOptions;
// Pruebas, solucionar mas tarde
public class Main {
    public static void main(String[] args) {
        Clientes autonomo1 = new Clientes();
        autonomo1.setCodigoCliente("001");

        Autonomos autonomo2 = new Autonomos();
        autonomo2.setDni("001A");

        Sociedades sociedad1 = new Sociedades();
        sociedad1.setCif("002B");
        sociedad1.getCodigoCliente();

        System.out.println(autonomo1);

        System.out.println(sociedad1);


    }
}