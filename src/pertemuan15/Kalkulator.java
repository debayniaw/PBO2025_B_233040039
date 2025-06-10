import javax.swing.*;
import java.awt.event.*;

public class Kalkulator extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton buttonJumlah;

    public Kalkulator() {
        setTitle("Penjumlahan");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 180);
        setLayout(null);

        // TextField 1
        textField1 = new JTextField();
        textField1.setBounds(50, 10, 150, 25);
        add(textField1);

        // TextField 2
        textField2 = new JTextField();
        textField2.setBounds(50, 40, 150, 25);
        add(textField2);

        // Tombol "Jumlah"
        buttonJumlah = new JButton("Jumlah");
        buttonJumlah.setBounds(50, 75, 150, 30);
        add(buttonJumlah);

        // Aksi tombol
        buttonJumlah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int angka1 = Integer.parseInt(textField1.getText());
                    int angka2 = Integer.parseInt(textField2.getText());
                    int hasil = angka1 + angka2;

                    JOptionPane.showMessageDialog(null, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setLocationRelativeTo(null); // Biar tampil di tengah layar
        setVisible(true);
    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}
