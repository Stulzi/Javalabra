package UI;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import Logiikka.Taistelu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SpecialKuuntelija implements ActionListener{

    SpecialKuuntelija() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Taistelu.taistelu();
    }
    
    
}
