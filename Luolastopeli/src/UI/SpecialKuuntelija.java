package UI;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import Logiikka.Taistelu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SpecialKuuntelija implements ActionListener{
    Kayttoliittyma ui;
    Taistelu t;
    
    SpecialKuuntelija(Kayttoliittyma ui) {
        this.ui = ui;
        t = new Taistelu();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        ui.tyhjaaActionit();
        t.taistelu("special", ui);
        ui.setAktiivinenTaistelu(t);
        ui.paivitaHahmoAction();
        ui.paivitaVihollinenAction();
        ui.paivitaStatus();
    }
    
    
}
