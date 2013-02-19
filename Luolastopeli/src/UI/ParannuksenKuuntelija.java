
package UI;

import Logiikka.Taistelu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ParannuksenKuuntelija implements ActionListener{
    Kayttoliittyma ui;
    Taistelu t;
    
    ParannuksenKuuntelija(Kayttoliittyma ui) {
        this.ui = ui;
        t = new Taistelu();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        ui.tyhjaaActionit();
        t.taistelu("paranna", ui);
        ui.setAktiivinenTaistelu(t);
        ui.paivitaStatus();
    }
    
}
