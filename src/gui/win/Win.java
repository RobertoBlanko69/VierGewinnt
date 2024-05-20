import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Label;

class Win{

    public static void main(String[] args) {
        JFrame winningFenster = new JFrame();
        winningFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        winningFenster.setTitle("4-Gewinnt");
        winningFenster.setSize(1000, 500);
        winningFenster.setLayout(new BorderLayout());
        UIManager.put("Panel.background", Color.WHITE);
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("Label.background", Color.WHITE);

        JPanel winningGrundstruktur = new JPanel();
        winningFenster.add(winningGrundstruktur, BorderLayout.CENTER);

        JPanel StrukturDerMitte = new JPanel();
        StrukturDerMitte.setLayout(new GridLayout(6,1));
        winningGrundstruktur.add(StrukturDerMitte);

        JLabel LueckenFueller1 = new JLabel("");
        JLabel LueckenFueller2 = new JLabel("");
        JLabel LueckenFueller3 = new JLabel("");
        JLabel LueckenFueller4 = new JLabel("");

        JPanel winningPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel winningLabel = new JLabel("SPIELER HAT GEWONNEN");
        winningPanel.add(winningLabel);
        StrukturDerMitte.add(LueckenFueller1);
        StrukturDerMitte.add(LueckenFueller2);
        StrukturDerMitte.add(LueckenFueller3);
        StrukturDerMitte.add(LueckenFueller4);
        StrukturDerMitte.add(winningPanel);
        JPanel ButtonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        StrukturDerMitte.add(ButtonsPanel);
        JButton VerlassenButton = new JButton("VERLASSEN");
        JButton NeustartenButton = new JButton("NEUSTARTEN");
        JButton EinstellungenButton = new JButton("EINSTELLUNGEN");
        ButtonsPanel.add(VerlassenButton);
        ButtonsPanel.add(NeustartenButton);
        ButtonsPanel.add(EinstellungenButton);
        winningFenster.setVisible(true);
    }
}