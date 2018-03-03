/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensador;

import java.util.Scanner;

/**
 *
 * @author Juan José Rangel.
 */
public class comprar{

    public int opcion;
    public int cantidad, cantidadM, cantidadG, cantidadC, cantidadCh;
    public int unidades;
    public int precioM, precioG , precioC, precioCh;
    public int preM, preG, preC, preCh;
    public int total;   
    
    comprar(int cantidadM, int precioM, int cantidadG, int precioG, int cantidadC, int precioC, int cantidadCh, int precioCh){
        this();
        this.cantidadM = cantidadM;
        this.precioM = precioM;
        this.cantidadG = cantidadG;
        this.precioG = precioG;
        this.cantidadC = cantidadC;
        this.precioC = precioC;
        this.cantidadCh = cantidadCh;
        this.precioCh = precioCh;
    }
       
    comprar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Compra de articulos:");
        System.out.println("1.-Margarita");
        System.out.println("2.-Galletas");
        System.out.println("3.-Chitos");
        System.out.println("4.-Chocorramo");

        opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.print("Precio u/n: "+this.precioM+"\nUnidades disponibles: "+this.cantidadM);
            System.out.print("\n¿Cuantas unidades desea?: ");
            unidades = sc.nextInt();
            margarita(unidades);
        }
        if (opcion == 2) {
            System.out.print("Precio u/n: "+this.precioG+"\nUnidades disponibles: "+this.cantidadG);
            System.out.print("\n¿Cuantas unidades desea?: ");
            unidades = sc.nextInt();
            galletas(unidades);
        }
        if (opcion == 3) {
            System.out.print("Precio u/n: "+this.precioC+"\nUnidades disponibles: "+this.cantidadC);
            System.out.print("\n¿Cuantas unidades desea?: ");
            unidades = sc.nextInt();
            chitos(unidades);
        }
        if (opcion == 4) {
            System.out.print("Precio u/n: "+this.precioCh+"\nUnidades disponibles: "+this.cantidadCh);
            System.out.print("\n¿Cuantas unidades desea?: ");
            unidades = sc.nextInt();
            chocorramo(unidades);
        }
    }
    
    
    private void margarita(int x) {
        preM = this.precioM;
        total = preM * x;
        cantidad = this.cantidadM - x;
        System.out.print("Cantidad paquetes:" + cantidad + "\nPrecio total:" + total);
    }

    private void galletas(int x) {
        preG = this.precioG;
        total = preG * x;
        cantidad = this.cantidadG - x;
        System.out.print("Cantidad paquetes:" + cantidad + "\nPrecio total:" + total);
    }

    private void chitos(int x) {
        preC = this.precioC;
        total = preC * x;
        cantidad = this.cantidadC - x;
        System.out.print("Cantidad paquetes:" + cantidad + "\nPrecio total:" + total);
    }

    private void chocorramo(int x) {
        preCh = this.precioCh;
        total = preCh * x;
        cantidad = this.cantidadCh - x;
        System.out.print("Cantidad paquetes:" + cantidad + "\nPrecio total:" + total);
    }

}
