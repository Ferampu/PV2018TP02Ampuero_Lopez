/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import fechas.Fecha;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Punto2 {
    public void llamarMenu2() throws ParseException{
        int op;
        do{
            System.out.println("Menu Punto 2");
            System.out.println("1.Devolver edad en semanas: ");
            System.out.println("2.Obtener estacion: ");
            System.out.println("3.Mostrar cantidad de domingos: ");
            System.out.println("4.Devolver diferencia en dias:");
            System.out.println("5.Salir");
            Scanner scaneo=new Scanner(System.in);
            System.out.println("Ingrese opcion: ");
            op=scaneo.nextInt();
            switch(op){
                case 1: devolverEdad();
                break;
                case 2: obtenerE();
                break;
                case 3: mostrarDomingos();
                break;
                case 4: devolverDifEDias();
                break;
            }
        } while (op!=5);
    }
    public void devolverEdad() throws ParseException{
        Scanner intro=new Scanner(System.in);
        Fecha unFecha=new Fecha();
        System.out.println("Ingrese fecha de nacimiento: ");
        String fechanac=intro.next();
        unFecha.recibirFecha(fechanac);
        System.out.println("La edad en semanas es:"+unFecha.obtenerEdad());
    }
    public void obtenerE(){
        String fecha="";
        Scanner nuevoIngreso=new Scanner(System.in);
        System.out.println("Ingrese fecha en el formato dd/MM/yyyy");
        fecha=nuevoIngreso.nextLine();
        Fecha nuevaFecha=new Fecha();
        nuevaFecha.recibirFecha(fecha);
        nuevaFecha.separarFecha();
        System.out.println("La estacion del año es:"+nuevaFecha.devolverEstacion());
    }
    public void mostrarDomingos() throws ParseException{
        Scanner leer=new Scanner(System.in);
        Fecha nuevFec=new Fecha();
        System.out.println("Ingrese la primer fecha: ");
        String fe1=leer.nextLine();
        System.out.println("Ingrese la segunda fecha: ");
        String fe2=leer.nextLine();
        nuevFec.recibirFechas(fe1, fe2);
        System.out.println("La cantidad de domingos entre las fechas es:"+nuevFec.obtenerDomingos());
    }
    public void devolverDifEDias() throws ParseException{
        Scanner pedir=new Scanner(System.in);
        Fecha difDias=new Fecha();
        System.out.println("Ingrese fecha como limite inferior:");
        String fech1=pedir.next();
        System.out.println("Ingrese fecha como limite superior:");
        String fech2=pedir.next();
        difDias.recibirFechas(fech1, fech2);
        System.out.println("La diferencia de dias es:"+difDias.obtenerDias());
    }
}
