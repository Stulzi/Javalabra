package UI;
   
import Elavat.Pelihahmo;
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
        hahmoAction.setText(hahmo.annaStatus());
        container.add(status).setEnabled(false);
        container.add(hahmoAction).setEnabled(false);
        container.add(vihollinenAction).setEnabled(false);
        container.add(LuoNapit(), BorderLayout.SOUTH);
    }
    
    private JPanel LuoNapit(){
         JPanel panel = new JPanel(new GridLayout(1, 2));
         JButton hyokkaa = new JButton("Attack");
         JButton special = new JButton("Special");
         HyokkayksenKuuntelija hyokkaysKuuntelija = new HyokkayksenKuuntelija();
         SpecialKuuntelija specialKuuntelija = new SpecialKuuntelija(this);
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
        status.setText(hahmo.annaStatus());
    }
    
    public void paivitaHahmoAction(){
        hahmoAction.setText(taistelu.getHahmo().getTaistelutila());    
    }
    
    public void paivitaVihollinenAction(){
        vihollinenAction.setText(taistelu.getVihollinen().getTaistelutila());
    }
   
    
    public void setAktiivinenTaistelu(Taistelu t){
        taistelu = t;
    }
    
   
    
}
    

