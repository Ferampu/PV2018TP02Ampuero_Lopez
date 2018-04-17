/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Punto3 {

    public Punto3() {
    }
    
    public String devolver100Dias() throws ParseException{
        Scanner in=new Scanner(System.in);
        System.out.println("Ingrese dia:");
        String dia=in.next();
        System.out.println("Ingrese mes:");
        String mes=in.next();
        System.out.println("Ingrese año:");
        String año=in.next();
        String fechacien="";
        fechacien=dia+"/"+mes+"/"+año;
        SimpleDateFormat cien=new SimpleDateFormat("dd/MMMM/yyyy");
        SimpleDateFormat años=new SimpleDateFormat("yyyy");
        Date fcien;
        fcien=cien.parse(fechacien);
        for (int i=1; i<=100; i++){
            fcien.setTime(fcien.getTime()+86400000);
        }
        String d="";
        String m="";
        String a="";
        switch(fcien.getDay()){
            case 0: d="Lunes";
            break;
            case 1: d="Martes";
            break;
            case 2: d="Miercoles";
            break;
            case 3: d="Jueves";
            break;
            case 4: d="Viernes";
            break;
            case 5: d="Sabado";
            case 6: d="Domingo";
        }
        switch(fcien.getMonth()){
            case 1: m="Enero";
            break;
            case 2: m="Febrero";
            break;
            case 3: m="Marzo";
            break;
            case 4: m="Abril";
            break;
            case 5: m="Mayo";
            break;
            case 6: m="Junio";
            break;
            case 7: m="Julio";
            break;
            case 8: m="Agosto";
            break;
            case 9: m="Septiembre";
            break;
            case 10: m="Octubre";
            break;
            case 11: m="Noviembre";
            break;
            case 12: m="Diciembre";
            break;
        }
        a=años.format(fcien);
        String fechaa=d+","+" de "+m+" del "+a;
        return fechaa;
    }
}
        /*}*/
    /**
     * @return the dia
     */
    
