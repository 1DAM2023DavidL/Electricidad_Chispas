import java.net.StandardSocketOptions;
// Pruebas, solucionar mas tarde
public class Main {
    public static void main(String[] args) {
        Autonomos autonomo1 = new Autonomos("001",05003,"Ávila","Ávila","autonomo1@gmail.com",123456789,"Autnomo","Autonomo1","Autonomo1","12345678F");
        System.out.println(autonomo1);

        Sociedades sociedad1 = new Sociedades("002",05002,"Ávila","Ávila","sociedad1@gmail.com",987654321,"Sociedad","Sociedad.SL","D87654321");
        System.out.println("sociedad1");
    }
}