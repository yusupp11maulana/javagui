import java.awt.*;
import javax.swing.*;

// import jdk.internal.platform.Container;

import java.awt.event.*;

class Test extends JFrame implements ActionListener{
    Container apps = new Container();
    JTextField kiri = new JTextField(100);
    JTextField kanan = new JTextField(100);
    JTextField hasil = new JTextField(100);
    JButton hasilnya = new JButton("Hasil");

    Test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Contoh GUI");
        setLocation(175, 300);
        setSize(600, 100);
        apps = getContentPane();
        apps.setLayout(null);

        apps.add(kiri);
        kiri.setBounds(10, 5, 100, 50);

        apps.add(kanan);
        kanan.setBounds(160, 5, 100, 50);

        apps.add(hasilnya);
        hasilnya.addActionListener(this);
        hasilnya.setBounds(310, 15, 100, 30);

        apps.add(hasil);
        hasil.setBounds(450, 5, 100, 50);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object tombol = e.getSource();
        if (tombol == hasilnya) {
            int kirinya = Integer.parseInt(kiri.getText());
            int kanannya = Integer.parseInt(kanan.getText());
            int jumlah = kirinya + kanannya;
            int kali = kirinya * kanannya;
            hasil.setText(Integer.toString(kali));
        }
    }
    
    public static void main(String[] args) {
        new Test();
    }
}