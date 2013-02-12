package UI;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import Logiikka.Taistelu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HyokkayksenKuuntelija implements ActionListener {

    HyokkayksenKuuntelija() {   
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Taistelu.taistelu();
        
    }
    
}
