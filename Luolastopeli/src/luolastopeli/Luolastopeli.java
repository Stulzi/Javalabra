
package luolastopeli;

import Elavat.Elollinen;
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import Logiikka.Taistelu;
import java.util.Random;

public class Luolastopeli {


    public static void main(String[] args) { 
        
        Pelihahmo hahmo= new Pelihahmo(300,100,89,12);
        Vihollinen lepakko= new Vihollinen("Bat",180,70,20);
        
        Taistelu.taistelu(hahmo, lepakko);        

        
    
        
        
    }
    

}