package UI;
   
import Elavat.Pelihahmo;
import Elavat.Vihollinen;
import Logiikka.Luola;
import Logiikka.Luolasto;
import Logiikka.Taistelu;
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
    private Taistelu taistelu;
    private JTextArea status;
    private JTextArea hahmoAction;
    private JTextArea vihollinenAction;
    
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
        
        status = new JTextArea();
        hahmoAction = new JTextArea();
        vihollinenAction = new JTextArea();
        status.setText(hahmo.annaStatus());
        container.add(status).setEnabled(false);
        container.add(hahmoAction).setEnabled(false);
        container.add(vihollinenAction).setEnabled(false);
        container.add(LuoNapit(), BorderLayout.SOUTH);
    }
    
    private JPanel LuoNapit(){
         JPanel panel = new JPanel(new GridLayout(1, 3));
         JButton hyokkaa = new JButton("Attack");
         JButton special = new JButton("Special");
         JButton paranna = new JButton("Heal");
         HyokkayksenKuuntelija hyokkaysKuuntelija = new HyokkayksenKuuntelija(this);
         SpecialKuuntelija specialKuuntelija = new SpecialKuuntelija(this);
         ParannuksenKuuntelija parannusKuuntelija = new ParannuksenKuuntelija(this);
         hyokkaa.addActionListener(hyokkaysKuuntelija);
         special.addActionListener(specialKuuntelija);
         paranna.addActionListener(parannusKuuntelija);
         panel.add(hyokkaa);
         panel.add(special);
         panel.add(paranna);
         return panel;
    }
         
    

    public JFrame getFrame() {
        return frame;
    }
    
    public void paivitaStatus(){
        status.setText(hahmo.annaStatus());
    }
    
    public void paivitaHahmoAction(){
        hahmoAction.append(Luolasto.getHahmo().getTaistelutila()); 
    }
    
    public void paivitaVihollinenAction(){
        for (Vihollinen vihollinen : Luola.getViholliset()) {
            vihollinenAction.append(vihollinen.getTaistelutila());
        }
        
    }
   
    
    public void setAktiivinenTaistelu(Taistelu t){
        taistelu = t;
    }
    
    public void tyhjaaHahmoAction(){
        hahmoAction.setText("");
    }
    
    public void tyhjaaVihollinenAction(){
        vihollinenAction.setText("");
    }
    
    public void tyhjaaActionit(){
        hahmoAction.setText("");
        vihollinenAction.setText("");
    }
   
    public JTextArea annaHahmoAction(){
        return hahmoAction;
    }

    public JTextArea annaVihollinenAction() {
        return vihollinenAction;
    }
}