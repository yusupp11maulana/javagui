import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App extends JFrame implements ActionListener {
    Container boks = new Container();
    JLabel label1 = new JLabel("Temperature in Celcius");
    JLabel label2 = new JLabel("Temperature in Fahrenheit");
    JTextField celcius = new JTextField(100);
    JTextField fahre = new JTextField(100);

    App() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Temperature Conversion");
        setLocation(175, 300);
        setSize(600, 100);
        boks = getContentPane();
        boks.setLayout(null);

        boks.add(label1);
        label1.setBounds(20, 18, 150, 30);
        // (Horizontal, vertikal, panjang, lebar)
        boks.add(celcius);
        celcius.addActionListener(this);
        celcius.setBounds(180, 18, 70, 30);

        boks.add(label2);
        label2.setBounds(300, 18, 180, 30);
        boks.add(fahre);
        fahre.addActionListener(this);
        fahre.setBounds(480, 18, 70, 30);
        // show();

    }
    
    public void actionPerformed(ActionEvent e) {
        Object data = e.getSource();
        if (data == celcius) {
            double suhucel = Double.parseDouble(celcius.getText());
            double suhufah = (suhucel * 9 / 5) + 32;
            fahre.setText(Double.toString(suhufah));
        } else if (data == fahre) {
            double suhufah = Double.parseDouble(fahre.getText());
            double suhucel = (suhufah - 32) * 5 / 9;
            celcius.setText(Double.toString(suhucel));
        }
    }
    public static void main (String[] args){
        new App();
    }
}