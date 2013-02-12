package UI;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import Logiikka.Taistelu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HyokkayksenKuuntelija implements ActionListener {
    
    private Pelihahmo hahmo;
    private ArrayList<Vihollinen> viholliset;

    HyokkayksenKuuntelija(Pelihahmo hahmo, ArrayList<Vihollinen> viholliset) {
        this.hahmo= hahmo;
        this.viholliset=viholliset;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Taistelu.taistelu(hahmo, viholliset);
    }
    
}
