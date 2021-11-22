/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */

public class Dantzari {
    String izena;
    int adina;
    String gustukoDantza;
    
    // Dantzari klasearen eraikitzailea
    public Dantzari( String izena ) {
        this.izena = izena;
    }
    
    // Dantzaiaren adina zehazteko metodoa
    public void dantzariarenAdina( int urteak ) {
        adina = urteak;
    }
    
    // Dantzaiaren gustuko dantza gordetzeko metodoa
    public void gustukoDantza (String dantza){
        gustukoDantza = dantza;
    }
    
    // Dantzarien informazioa bistaratu
    public void dantzariaBistaratu (){
        System.out.println (izena+ " dantzariak "+adina+" urte ditu eta " +gustukoDantza+" du gustukoa");
    }
    
}
