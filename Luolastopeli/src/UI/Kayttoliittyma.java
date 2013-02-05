package UI;
   
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    public Kayttoliittyma() {
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
        container.add(new JTextArea()).setEnabled(false);
        container.add(luoValikko(), BorderLayout.SOUTH);
    }

    private JPanel luoValikko() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(new JButton("Attack"));
        panel.add(new JButton("Special Attack"));
        return panel;
    }
         
    

    public JFrame getFrame() {
        return frame;
    }
}
    

