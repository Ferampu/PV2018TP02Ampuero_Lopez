/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Fer
 */
public class Fecha {
    private String dia;
    private String mes;
    private String año;
    private String fecha;
    private String fecha1;
    private String fecha2;
    public Fecha() {
    }
    public void recibirFecha(String unaFecha){
        setFecha(unaFecha);
    }
    public void separarFecha(){
        setDia(getFecha().substring(0, 2));
        setMes(getFecha().substring(3, 5));
        setAño(getFecha().substring(6, 8));
    }
    public String devolverEstacion(){
        String estacion="";
        int opcion=0;
        opcion=Integer.parseInt(getMes());
        int d=Integer.parseInt(getDia());
        switch(opcion){
            case 1:
                estacion="Verano";
            case 2:
                estacion="Verano";
            case 3:
                if(d<21){
                    estacion="Verano";
                }
                else{
                    estacion="Otoño";
                }
            break;
            case 4:
                estacion="Otoño";
            case 5:
                estacion="Otoño";
            case 6:
                if(d<21){
                    estacion="Otoño";
                }
                else{
                    estacion="Invierno";
                }
            break;
            case 7: 
                estacion="Invierno";
            case 8: 
                estacion="Invierno";
            case 9:
                if(d<21){
                    estacion="Invierno";
                }
                else{
                    estacion="Primavera";
                }
            break;
            case 10:
                estacion="Primvera";
            case 11:
                estacion="Primavera";
            case 12:
                if(d<21){
                    estacion="Primavera";
                }
                else{
                    estacion="Verano";
                }
            break; 
        } 
        return estacion;
    }
    public void recibirFechas(String f1, String f2){
        setFecha1(f1);
        setFecha2(f2);
    }
    public int obtenerDomingos() throws ParseException{
        int c=0;
        SimpleDateFormat nuevaFec=new SimpleDateFormat("dd/MM/yyyy");
        Date fec1=nuevaFec.parse(getFecha1());
        Date fec2=nuevaFec.parse(getFecha2());
        Date fechaInicio=nuevaFec.parse(getFecha1());
        for (long i=fec1.getTime(); i<=fec2.getTime(); i=i+86400000){
            fechaInicio.setTime(i);
            if (fechaInicio.getDay()==6){
                c++;
            }
        }
        return c;
    }
    public int obtenerEdad() throws ParseException{
        int cont=0;
        SimpleDateFormat nuevaFech=new SimpleDateFormat("dd/MM/yyyy");
        Date fnac=nuevaFech.parse(getFecha());
        Date hoy=new Date();
        for (long i=fnac.getTime(); i<=hoy.getTime(); i=i+604800000){
            cont++;
        }
        return cont;
    }
    public long obtenerDias() throws ParseException{
        long dias=0;
        SimpleDateFormat nuevaFec=new SimpleDateFormat("dd/MM/yyyy");
        Date fec1=nuevaFec.parse(getFecha1());
        Date fec2=nuevaFec.parse(getFecha2());
        dias=fec2.getTime()-fec1.getTime();
        dias=dias/86400000;
        return dias;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the fecha1
     */
    public String getFecha1() {
        return fecha1;
    }

    /**
     * @param fecha1 the fecha1 to set
     */
    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    /**
     * @return the fecha2
     */
    public String getFecha2() {
        return fecha2;
    }

    /**
     * @param fecha2 the fecha2 to set
     */
    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
    
}
