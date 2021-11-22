
/**
 *
 * Egileak Iñaki Goirizelaia eta Maider Huarte
 */
public class Gainzama {
    
    public int batu ( int a, int b ) { 
        return ( a + b ); 
    } 
  

    public int batu ( int a, int b, int k ) { 
        return ( a + b + k ); 
    } 
  

    public double batu ( double a, double b, double k ) { 
        return ( a + b + k ); 
    } 
  
    
    public static void main( String parametroak [ ] ) {
        
        Gainzama gainzamatutakoBatu = new Gainzama( ); 
        
        System.out.println( gainzamatutakoBatu.batu( 123, 78 ) ); 
        System.out.println( gainzamatutakoBatu.batu( 123, 78, 450 ) ); 
        System.out.println( gainzamatutakoBatu.batu( 3.5, 37.89, 708.678 ) ); 
    } 
 
}
