import javax.swing.*;
import java.awt.event.*;

public class Practical8 extends JFrame {

    JTextField principal, rate, time, result;
    JButton calculate;

    Practical8() {

        setTitle("Investment Calculator");
        setSize(300, 300);
        setLayout(null);

        JLabel l1 = new JLabel("Principal:");
        l1.setBounds(20, 20, 100, 25);
        add(l1);

        principal = new JTextField();
        principal.setBounds(120, 20, 120, 25);
        add(principal);

        JLabel l2 = new JLabel("Rate:");
        l2.setBounds(20, 60, 100, 25);
        add(l2);

        rate = new JTextField();
        rate.setBounds(120, 60, 120, 25);
        add(rate);

        JLabel l3 = new JLabel("Time:");
        l3.setBounds(20, 100, 100, 25);
        add(l3);

        time = new JTextField();
        time.setBounds(120, 100, 120, 25);
        add(time);

        JLabel l4 = new JLabel("Result:");
        l4.setBounds(20, 140, 100, 25);
        add(l4);

        result = new JTextField();
        result.setBounds(120, 140, 120, 25);
        result.setEditable(false);
        add(result);

        calculate = new JButton("Calculate");
        calculate.setBounds(80, 180, 120, 30);
        add(calculate);

        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(principal.getText());
                double r = Double.parseDouble(rate.getText());
                double t = Double.parseDouble(time.getText());

                double si = (p * r * t) / 100;

                result.setText(String.valueOf(si));
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Practical8();
    }
}
