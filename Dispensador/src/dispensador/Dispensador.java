package dispensador;
import java.util.Scanner;
/**
 *
 * @author Juan José Rangel
 */
public class Dispensador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int selector;
        Scanner sc = new Scanner(System.in);
        System.out.println("   Menu");
        System.out.println("1.-Compra");
        System.out.println("2.-Gestion");
        System.out.println("3.-Estadistica");
        System.out.println("4.-Salir");
        selector = sc.nextInt();
        
        if(selector == 1){
        comprar obj1 = new comprar();
        }
        if(selector == 2){
        gestion obj2 = new gestion();
        }
        if(selector == 3){
        estat obj3 = new estat();
        }
        if(selector == 4){
         System.exit(0);
        }
        
        
    }
}