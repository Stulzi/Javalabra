package UI;

import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SpecialKuuntelija implements ActionListener{
    private Pelihahmo hahmo;
    private ArrayList<Vihollinen> viholliset;
    
    SpecialKuuntelija(Pelihahmo hahmo, ArrayList<Vihollinen> viholliset) {
        this.hahmo= hahmo;
        this.viholliset=viholliset;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
