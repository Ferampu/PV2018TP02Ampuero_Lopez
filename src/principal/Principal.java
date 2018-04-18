/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        llamarMenuPrincipal();
        // TODO code application logic here
    }
    public static void llamarMenuPrincipal() throws ParseException{
        Scanner scaneo=new Scanner(System.in);
        Punto1 nuevoPunto1 =new Punto1();
        Punto2 nuevoPunto2 =new Punto2();
        Punto3 nuevoPunto3 =new Punto3();
        int opcion;
        do{
            System.out.println("-------------MENU TP02-----------");
            System.out.println("1.Resolver punto 1:");
            System.out.println("2.Resolver punto 2:");
            System.out.println("3.Resolver punto 3:");
            System.out.println("4.Salir del programa:");
            System.out.println("Ingrese opcion:");
            opcion=scaneo.nextInt();
            switch(opcion){
                case 1: nuevoPunto1.llamarMenu1();
                break;
                case 2: nuevoPunto2.llamarMenu2();
                break;
                case 3: nuevoPunto3.devolver100Dias();
                break;
            }
        }while(opcion!=4);
    }
}
