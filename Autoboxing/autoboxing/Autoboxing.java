/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxing;

/**
 *
 * @author ibp1718
 */
public class Autoboxing {
   
    public static void main( String[] parametroak) {
        int x = 1;
        
        //hemen boxing mekanismoa erabiltzen da valueOf metodoa erabiliz
        //baina ez da beharrezkoa
        Integer i = Integer.valueOf( x ); 
        Integer k = x; //autoboxing mekanismoa
        System.out.println( "x = "+x+" i = "+i+ " k = " +k );
        
        Float f = new Float( 3.1415 );
        
        //unboxing mekanismoa
        //Ez da beharrezkoa
        float f1 = f.floatValue();
        
        //unboxing mekanismoa automatikoki erabiltzen da
        float f2 = f;
        System.out.println( "f = "+f+" f1 = "+f1+ " f2 = " +f2 );      
    }
    
}

