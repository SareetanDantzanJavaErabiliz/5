
/**
 *
 * Egileak: Iñaki Goirizelaia eta Maider Huarte
 */
public class DantzaTaldeaGetSet {

    public static void main( String [ ] parametroak ) {

        //dantzariBat objektua sortu parametrorik gabe
	DantzariakGetSet dantzariBat = new DantzariakGetSet ();

	//dantzariBi objektua sortu parametroak erabiliz
        DantzariakGetSet dantzariBi = new DantzariakGetSet (30, "Maialen", "Kaxarranka");

	//dantzariBat objketuaren atributuei balioak eman
        dantzariBat.setIzena ( "Manex" );
        dantzariBat.setAdina(23);
        dantzariBat.setGustukoDantza ( "Bizkaiko Dantzari Dantza" );

	//Dantzari biak bistaratu
        dantzariBat.dantzariaBistaratu();
        dantzariBi.dantzariaBistaratu();

    }
    
}
