
package dantzataldeagetset;

import java.util.Scanner;

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */
public class DantzariakGetSet {
    private int adina;
    private String izena;
    private String gustukoDantza;
    
    public DantzariakGetSet ( ) {
        
    }
    
/*    public DantzariakGetSet ( ) {
        Scanner irakur = new Scanner(System.in);
        System.out.print (" Sartu dantzariaren adina : ");
        adina = irakur.nextInt ();
        irakur.nextLine(); // honela bufferean gelditzen den \n garbitzen dugu
        System.out.print (" Sartu dantzariaren izena : ");
        izena = irakur.nextLine();
        System.out.print (" Sartu dantzariaren gustuko dantza : ");
        gustokoDantza = irakur.nextLine ();
        //System.out.print (" Sartu dantzariaren adina : ");
        //adina = irakur.nextInt ();
        System.out.println ("--------------------------------------");
        
    }*/
        
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
