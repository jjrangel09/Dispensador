/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensador;
import java.util.Scanner;
/**
 *
 * @author JuanJ
 */
class gestion {
    gestion(){
        int cM, pM, cG, pG, cC, pC, cCh, pCh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gestion de precios y Cantidades");
        
        
        System.out.println("Ingrese Precios:");
        System.out.println("Papas margarita (Entero):");
        pM = sc.nextInt();
        System.out.println("Galletas (Entero):");
        pG = sc.nextInt();
        System.out.println("Chitos(Entero):");
        pC = sc.nextInt();
        System.out.println("Chocorramos (Entero):");
        pCh = sc.nextInt();
        
        
        System.out.println("Ingrese Cantidades:");
        System.out.println("Papas margarita (Entero):");
        cM = sc.nextInt();
        System.out.println("Galletas (Entero):");
        cG = sc.nextInt();
        System.out.println("Chitos (Entero):");
        cC = sc.nextInt();
        System.out.println("Chocorramos (Entero):");
        cCh = sc.nextInt();
        
        System.out.println(""+cM+ pM+ cG+ pG+ cC+ pC+ cCh+ pCh);
        comprar obj1 = new comprar(cM, pM, cG, pG, cC, pC, cCh, pCh);
        
        
    }
    
    }
