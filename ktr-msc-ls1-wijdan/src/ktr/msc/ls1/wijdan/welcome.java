package ktr.msc.ls1.wijdan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Class for Step 3 part 2
 *
 * @author Wijdan ABDERRAHMANI
 */
class welcome extends JFrame implements ActionListener {

    private Container c;
    private JTextField password;
    private JTextField pseudo;
    private JButton save;
    private String truepseudo;
    private String truepassword;

    /*
    * Constructeur du front
     */
    public welcome(JTextField pseudonyme, JTextField plainpassword) {
        setTitle("Welcome " + pseudonyme.getText());
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
        truepseudo = pseudonyme.getText();
        truepassword = plainpassword.getText();
        JLabel title = new JLabel("Connection page");
        jlabel(title, 30, 500, 30, 300, 30);

        JLabel pass = new JLabel("Hi " + pseudonyme.getText() + " ! Please connect to your account to continue : ");
        jlabel(pass, 20, 700, 30, 35, 100);

        JLabel ps = new JLabel("Pseudo : ");
        jlabel(ps, 15, 100, 30, 250, 150);

        pseudo = new JTextField("");
        jtextfield(pseudo, 15, 200, 30, 350, 150);

        JLabel ps2 = new JLabel("Password : ");
        jlabel(ps2, 15, 100, 30, 250, 200);

        password = new JTextField("");
        jtextfield(password, 15, 200, 30, 350, 200);

        save = new JButton("connection");
        jbutton(save, 15, 250, 30, 300, 500);
        setVisible(true);
    }

    /*
    * Vérifie que les informations de connection sont correctes
    */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            if (pseudo.getText().equals(truepseudo) && password.getText().equals(truepassword)) {
                System.out.println("réussie");
                library test = new library();
            } else {
                JLabel attention = new JLabel();
                jlabel(attention, 20, 500, 20, 250, 450);
                attention.setText(" Wrong password or pseudo :/");
            }

        }

    }

    /*
    * Fonction JLabel implémentant le front des textes 
     */
    public void jlabel(JLabel namelabel, int sizepolice, int width, int height, int x, int y) {
        namelabel.setFont(new Font("Arial", Font.PLAIN, sizepolice));
        namelabel.setSize(width, height);
        namelabel.setLocation(x, y);
        c.add(namelabel);
    }

    /*
    * Fonction JTextField implémentant le front des forms
     */
    public void jbutton(JButton namebutton, int sizepolice, int width, int height, int x, int y) {
        namebutton.setFont(new Font("Arial", Font.PLAIN, sizepolice));
        namebutton.setSize(width, height);
        namebutton.setLocation(x, y);
        namebutton.addActionListener(this);
        c.add(namebutton);
    }

    /*
    * Fonction JTextField implémentant le front des forms
     */
    public void jtextfield(JTextField nametext, int sizepolice, int width, int height, int x, int y) {
        nametext.setFont(new Font("Arial", Font.PLAIN, sizepolice));
        nametext.setSize(width, height);
        nametext.setLocation(x, y);
        c.add(nametext);
    }

}
