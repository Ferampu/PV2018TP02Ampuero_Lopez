/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import cadenas.Cadena;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Punto1 {
    public void llamarMenu1(){
        int op;
        do{
            System.out.println("Menu Punto 1");
            System.out.println("1.Mostrar vocales de la cadena: ");
            System.out.println("2.Invertir cadena: ");
            System.out.println("3.Verificar caracter repetido: ");
            System.out.println("4.Salir:");
            Scanner scaneo=new Scanner(System.in);
            System.out.println("Ingrese opcion: ");
            op=scaneo.nextInt();
            switch(op){
                case 1: mostrarv();
                break;
                case 2: invertirc();
                break;
                case 3: verificarc();
                break;
            }
        } while (op!=4);
    }
    public void mostrarv(){
        Scanner nuevoIngreso=new Scanner(System.in);
        Cadena nuevaMuestra=new Cadena();
        System.out.println("Ingrese cadena");
        nuevaMuestra.setCadena(nuevoIngreso.nextLine());
        System.out.println("La cantidad de vocales de la cadena es:"+nuevaMuestra.contarVocales());
    }
    public void invertirc(){
        Scanner nuevoPedido=new Scanner(System.in);
        Cadena nuevaInversa=new Cadena();
        System.out.println("Ingrese cadena");
        nuevaInversa.setCadena(nuevoPedido.nextLine());
        System.out.println("La inversa de la cadena es: "+nuevaInversa.invertir());
    }
    public void verificarc(){
        char a;
        Scanner nuevoPed=new Scanner(System.in);
        Cadena nuevaVerific=new Cadena();
        System.out.println("Ingrese cadena");
        nuevaVerific.setCadena(nuevoPed.nextLine());
        System.out.println("Ingrese caracter a verificar: ");
        a=nuevoPed.next().charAt(0);
        System.out.println("El caracter se repite "+nuevaVerific.verificar(a)+" veces");
    }
}
