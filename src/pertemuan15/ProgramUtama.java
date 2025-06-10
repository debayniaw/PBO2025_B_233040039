
import javax.swing.JFrame;

public class ProgramUtama {
    public static void main(String[] args) {
        // Menampilkan HelloWorldForm1
        new HelloWorldForm1();

        // Menampilkan HelloWorldForm2 dalam frame
        JFrame form = new HelloWorldForm2();
        form.setVisible(true);

        // Menampilkan HelloWorldForm3
        new HelloWorldForm3();

        // Menampilkan Kalkulator
        new Kalkulator();
    }
}
