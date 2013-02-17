package UI;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import Logiikka.Taistelu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HyokkayksenKuuntelija implements ActionListener {

    Kayttoliittyma ui;
    Taistelu t;
    
    HyokkayksenKuuntelija(Kayttoliittyma ui) {   
        this.ui=ui;
        t=new Taistelu();
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        ui.tyhjaaActionit();
        Taistelu.taistelu("hyokkaa", ui);
        ui.setAktiivinenTaistelu(t);
        ui.paivitaHahmoAction();
        ui.paivitaVihollinenAction();
        ui.paivitaStatus();
        
        
    }
    
}
