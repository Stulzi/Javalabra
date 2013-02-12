package UI;
   
import Elavat.Pelihahmo;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
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
    
    public Kayttoliittyma(Pelihahmo hahmo){
        this.hahmo=hahmo;
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
        
        JTextArea status = new JTextArea(hahmo.annaStatus());
        JTextArea teksti =new JTextArea("Testiteksti");
        container.add(status).setEnabled(false);
        container.add(teksti).setEnabled(false);
        container.add(LuoNapit(), BorderLayout.SOUTH);
    }
    
    private JPanel LuoNapit(){
         JPanel panel = new JPanel(new GridLayout(1, 2));
         JButton hyokkaa = new JButton("Attack");
         JButton special = new JButton("Special");
         HyokkayksenKuuntelija hyokkaysKuuntelija = new HyokkayksenKuuntelija();
         SpecialKuuntelija specialKuuntelija = new SpecialKuuntelija();
         hyokkaa.addActionListener(hyokkaysKuuntelija);
         special.addActionListener(specialKuuntelija);
         panel.add(hyokkaa);
         panel.add(special);
         return panel;
    }
         
    

    public JFrame getFrame() {
        return frame;
    }
    
    public void paivitaStatus(){
        
    }
    
}
    

