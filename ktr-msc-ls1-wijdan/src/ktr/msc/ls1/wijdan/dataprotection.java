package ktr.msc.ls1.wijdan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Class for Step 3
 * 
 * @author Wijdan ABDERRAHMANI
 */
public class dataprotection extends JFrame implements ActionListener {

    private Container c;
    private JTextField plainpassword;
    private JLabel title;
    private JLabel dataname;
    private JLabel datacompanyname;
    private JLabel dataemail;
    private JLabel datamobilephone;
    private JTextField pseudo;
    private JButton save;
    
    /*
    * Constructeur du front
    */
    public dataprotection(JTextField name, JTextField companyname, JTextField email, JTextField mobilephone) {
        setTitle("Data protection");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
        title = new JLabel("Your profile information");
        jlabel(title, 30, 500, 30, 300, 30);
        dataname = new JLabel("Name : " + name.getText());
        jlabel(dataname, 20, 500, 30, 35, 100);
        datacompanyname = new JLabel("Company Name : " + companyname.getText());
        jlabel(datacompanyname, 20, 500, 30, 35, 150);
        dataemail = new JLabel("Email : " + email.getText());
        jlabel(dataemail, 20, 500, 30, 35, 200);
        datamobilephone = new JLabel("Mobile Phone : " + mobilephone.getText());
        jlabel(datamobilephone, 20, 500, 30, 35, 250);
        JLabel pass = new JLabel("Please enter a pseudonyme and password to protect your data : ");
        jlabel(pass, 20, 700, 30, 35, 300);
        JLabel ps = new JLabel("Pseudo : ");
        jlabel(ps, 15, 100, 30, 35, 350);
        pseudo = new JTextField("");
        jtextfield(pseudo, 15, 500, 30, 160, 350);
        JLabel ps2 = new JLabel("Password : ");
        jlabel(ps2, 15, 100, 30, 35, 400);
        plainpassword = new JTextField("");
        jtextfield(plainpassword, 15, 500, 30, 160, 400);
        save = new JButton("save");
        jbutton(save, 15, 100, 30, 300, 500);
        setVisible(true);
    }

    /*
    * Vérifie que le mot de passe et le pseudo sont bien crée avant de renvoyer vers la connection
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            if (pseudo.getText().equals("") || plainpassword.getText().equals("") || pseudo.getText().equals(" ") || plainpassword.getText().equals(" ")) {
                JLabel attention = new JLabel();
                jlabel(attention, 20, 500, 20, 250, 450);
                attention.setText("You forgot to create a pseudo and/or a password !");
            } else {
                welcome test = new welcome(pseudo, plainpassword);
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
    * Fonction JButton implémentant le front des bouttons
     */
    public void jbutton(JButton namebutton, int sizepolice, int width, int height, int x, int y) {
        namebutton.setFont(new Font("Arial", Font.PLAIN, sizepolice));
        namebutton.setSize(width, height);
        namebutton.setLocation(x, y);
        namebutton.addActionListener(this);
        c.add(namebutton);

    }

    /*
    * Fonction JButton implémentant le front des forms
     */
    public void jtextfield(JTextField nametext, int sizepolice, int width, int height, int x, int y) {
        nametext.setFont(new Font("Arial", Font.PLAIN, sizepolice));
        nametext.setSize(width, height);
        nametext.setLocation(x, y);
        c.add(nametext);
    }
}
