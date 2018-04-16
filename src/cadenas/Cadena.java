/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author Fer
 */
public class Cadena {
    private String cadena;

    public Cadena() {
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public String invertir(){
        String b="";
        char a;
        int c=getCadena().length();
        for(int i=c-1;i>=0;i--){
            a=getCadena().charAt(i);
            b+=a;
        }
        return b;
    }
    public int contarVocales(){
        int cont=0;
        for(int i=0;i<getCadena().length();i++){
            if((getCadena().charAt(i)=='a') || (getCadena().charAt(i)=='A') || (getCadena().charAt(i)=='e') || (getCadena().charAt(i)=='E') || (getCadena().charAt(i)=='i') || (getCadena().charAt(i)=='I') || (getCadena().charAt(i)=='o') || (getCadena().charAt(i)=='O') || (getCadena().charAt(i)=='u') || (getCadena().charAt(i)=='U')){
                cont++;
            }
        }
    return cont;
    }
    public int verificar(char c){
        int contador=0;
        int ta=getCadena().length();
        for(int i=0;i<ta;i++){
            if(getCadena().charAt(i)==c){
                contador++;
            }
        }
        return contador;
    }
}
    
  