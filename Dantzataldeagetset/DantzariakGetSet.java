/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */

import java.util.Scanner;

public class DantzariakGetSet {
    private int adina;
    private String izena;
    private String gustukoDantza;
    
    public DantzariakGetSet ( ) {
        
    }
        
    public DantzariakGetSet (int adina, String izena, String gustukoDantza ){
        this.adina = adina;
        this.izena = izena;
        this.gustukoDantza = gustukoDantza;
    }
    
    public void dantzariaBistaratu () {

        System.out.println ( getIzena ()+ " dantzariak "+getAdina ()+" urte ditu eta "+getGustukoDantza ()+" du gustukoa");
    }
    
    public int getAdina ( ){
        return (adina);
    }
    
    public void setAdina ( int urteak ) {
        this.adina = urteak;
    }
    
    public String getIzena ( ){
        return (izena);
    }
    
    public void setIzena ( String izena ) {
        this.izena = izena;
    }
    
    public String getGustukoDantza ( ){
        return (gustukoDantza);
    }
    
    public void setGustukoDantza ( String izena ) {
        this.gustukoDantza = izena;
    }
    
}
