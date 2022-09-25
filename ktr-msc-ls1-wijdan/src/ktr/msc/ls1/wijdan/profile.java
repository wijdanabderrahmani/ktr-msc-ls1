package ktr.msc.ls1.wijdan;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Class for Step 2 + Bonus 1
 * 
 * @author Wijdan ABDERRAHMANI
 */
public class profile extends JFrame implements ActionListener {

    private Container c;
    private JLabel name;
    private JLabel title;
    private JTextField tname;
    private JLabel mno;
    private JTextField mobilephone;
    private JLabel companyname;
    private JTextField cname;
    private JLabel email;
    private JTextField eemail;
    private JButton save;
    private JButton reset;
    
    
    /*
    * Constructeur du front
    */
    public profile() {
        setTitle("Epitech Test made by Wijdan ABDERRAHMANI");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        c = getContentPane();
        c.setLayout(null);
        title = new JLabel("Profile");
        jlabel(title, 30, 300, 30, 400, 30);
        name = new JLabel("Name");
        jlabel(name, 20, 100, 20, 300, 100);
        tname = new JTextField();
        jtextfield(tname, 15, 190, 20, 400, 100);
        companyname = new JLabel("Company Name");
        jlabel(companyname, 20, 200, 20, 200, 150);
        cname = new JTextField();
        jtextfield(cname, 15, 190, 20, 400, 150);
        email = new JLabel("Email");
        jlabel(email, 20, 200, 20, 300, 200);
        eemail = new JTextField();
        jtextfield(eemail, 15, 190, 20, 400, 200);
        mno = new JLabel("Mobile phone");
        jlabel(mno, 20, 200, 20, 220, 250);
        mobilephone = new JTextField();
        jtextfield(mobilephone, 15, 190, 20, 400, 250);
        save = new JButton("save");
        jbutton(save, 15, 100, 30, 400, 450);
        reset = new JButton("Reset");
        jbutton(reset, 15, 100, 30, 250, 450);
        setVisible(true);

    }

    /*
    * Vérifie que le nom est bien entrée et renvoie vers la création du compte
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            if (tname.getText().equals(" ") || tname.getText().equals("")) {
                JLabel attention = new JLabel();
                jlabel(attention, 20, 500, 20, 400, 400);
                attention.setText("The name is a mandatory value ! Retry.");

            } else {
                dataprotection test = new dataprotection(tname, cname, eemail, mobilephone);
            }
        } else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            cname.setText(def);
            eemail.setText(def);
            mobilephone.setText(def);
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
