package UI;
   
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Pelihahmo hahmo;
    private ArrayList<Vihollinen> viholliset;

    public Kayttoliittyma(Pelihahmo hahmo,Vihollinen... viholliset) {
        this.hahmo=hahmo;
        this.viholliset.addAll(Arrays.asList(viholliset));
    }

    @Override
    public void run() {
        frame = new JFrame("GoblinCave");
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JTextArea(
                "HP:" + hahmo.annaNykyinenHP() + "/" + hahmo.annaHP() + 
                " SP:" + hahmo.annaNykyinenSP() + "/" + hahmo.annaSP())
                ).setEnabled(false);
        container.add(new JTextArea("Testiteksti")).setEnabled(false);
        container.add(LuoNapit(), BorderLayout.SOUTH);
    }
    
    private JPanel LuoNapit(){
         JPanel panel = new JPanel(new GridLayout(1, 2));
         JButton hyokkaa = new JButton("Attack");
         JButton special = new JButton("Special");
         HyokkayksenKuuntelija hyokkaysKuuntelija = new HyokkayksenKuuntelija(hahmo, viholliset);
         SpecialKuuntelija specialKuuntelija = new SpecialKuuntelija(hahmo, viholliset);
         hyokkaa.addActionListener(hyokkaysKuuntelija);
         special.addActionListener(specialKuuntelija);
         panel.add(hyokkaa);
         panel.add(special);
         return panel;
    }
         
    

    public JFrame getFrame() {
        return frame;
    }
}
    

