import java.net.StandardSocketOptions;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Autonomos
        Autonomos autonomo1 = new Autonomos("001",05003,"Ávila","Ávila","autonomo1@gmail.com",123456789,"Autnomo","Autonomo1","Autonomo1","12345678F");
        System.out.println(autonomo1);

        // Sociedades
        Sociedades sociedad1 = new Sociedades("002",05002,"Ávila","Ávila","sociedad1@gmail.com",987654321,"Sociedad","Sociedad.SL","D87654321");
        System.out.println(sociedad1);

        // Productos
        Productos producto1 = new Productos("001","producto1","100€","21%","producto","001","apple","01ZR");
        Productos producto2 = new Productos("003","producto2","150€","21%","producto","002","apple","02RX");
        Productos producto3 = new Productos("004","producto3","90€","21%","producto","003","apple","03MZ");
        System.out.println(producto1);

        ArrayList<Productos> productos = new ArrayList<>();
        productos.add(producto1); //0
        productos.add(producto2); //1
        productos.add(producto3); //2

        // Servicios
        Servicios servicio1 = new Servicios("002","servicio1","50€","5%","servicio","001");
        Servicios servicio2 = new Servicios("005","servicio2","150€","25%","servicio","002");
        Servicios servicio3 = new Servicios("006","servicio3","550€","15%","servicio","003");

        ArrayList<Servicios> servicios = new ArrayList<>();
        servicios.add(servicio1); //0
        servicios.add(servicio2); //1
        servicios.add(servicio3); //2

        System.out.println(servicio1);

        // Facturas
        Facturas factura1 = new Facturas("001","22/11/2023","100€","121€");
        factura1.setClientes(autonomo1);
        factura1.setProductos(productos);
        factura1.setServicios(servicios);
        System.out.println(factura1);
    }
}