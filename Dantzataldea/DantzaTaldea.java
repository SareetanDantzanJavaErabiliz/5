

/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */
public class DantzaTaldea {
    
    public static void main( String parametroak [ ] ) {
        
        Dantzari dantzariBat = new Dantzari( "Manex" );
        Dantzari dantzariBi = new Dantzari( "Maialen" );
          
        // Metodoen bidez adina eta gustuko dantzak zehaztu       
        dantzariBat.dantzariarenAdina( 18 );
        dantzariBi.dantzariarenAdina( 22 );
        
        dantzariBat.gustukoDantza( "Bizkaiko Dantzari Dantza" );
        dantzariBi.gustukoDantza( "Zuberoko Maskarada" );
        
        //Dantarien informazioa bistaratu
        dantzariBat.dantzariaBistaratu( );
        dantzariBi.dantzariaBistaratu( );
                            
    }
    
}
