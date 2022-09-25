package ktr.msc.ls1.wijdan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 * Class for Step 4
 * 
 * @author Wijdan ABDERRAHMANI
 */
class library extends JFrame implements ActionListener {

    private Container c;
    private JButton logout;
    private JButton add;
    private JTextField cname;
    private JTextField ccname;
    private JTextField eemail;
    private JTextField mobilephone;
    private int y = 30;

    /*
    * Constructeur du front
     */
    public library() {
        setTitle("Library");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);

 
        JLabel title = new JLabel("Add new cards");
        jlabel(title, 25, 500, 30, 40, 30);

        JLabel name = new JLabel("Name");
        jlabel(name, 15, 100, 30, 30, 150);

        cname = new JTextField();
        jtextfield(cname, 15, 190, 20, 170, 150);

        JLabel companyname = new JLabel("Company Name");
        jlabel(companyname, 15, 200, 20, 30, 200);

        ccname = new JTextField();
        jtextfield(ccname, 15, 190, 20, 170, 200);

        JLabel email = new JLabel("Email");
        jlabel(email, 15, 200, 20, 30, 250);

        eemail = new JTextField();
        jtextfield(eemail, 15, 190, 20, 170, 250);

        JLabel mno = new JLabel("Mobile phone");
        jlabel(mno, 15, 190, 20, 30, 300);

        mobilephone = new JTextField();
        jtextfield(mobilephone, 15, 190, 20, 170, 300);

        add = new JButton("Add");
        jbutton(add, 15, 100, 30, 70, 500);


        JLabel title2 = new JLabel("Cards collection");
        jlabel(title2, 25, 500, 30, 600, 30);

        logout = new JButton("log out");
        jbutton(logout, 15, 100, 30, 700, 500);

        setVisible(true);
    }

    /*
    * Vérifie que l'adresse mail est bien ajouté et ajoute des cartes dans le front
    */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            if (eemail.getText().equals(" ") || eemail.getText().equals("")) {
                JLabel attention = new JLabel();
                jlabel(attention, 20, 500, 20, 250, 450);
                attention.setText("The email is mandatary! Retry");
            } else {
                card(cname, ccname, eemail, mobilephone, y);
                y = y + 35;
            }
        }

        if (e.getSource() == logout) {
            System.exit(0);
        }
    }

    /*
    * Création d'une business card
    */
    public void card(JTextField name, JTextField companyname, JTextField email, JTextField phonenumber, int y) {
        String data = "Name : " + name.getText() + "\n" + " Company Name : " + companyname.getText() + "\n"
                + " Email : " + email.getText() + "\n" + "Phone Number : " + phonenumber;
        JLabel cardregister = new JLabel();
        jlabel(cardregister, 15, 300, 150, 500, y);
        cardregister.setText(data);

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
    * Fonction JButton implémentant le front des boutons 
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
